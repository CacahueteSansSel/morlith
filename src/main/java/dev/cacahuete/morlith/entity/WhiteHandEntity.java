package dev.cacahuete.morlith.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.util.GeckoLibUtil;

public class WhiteHandEntity extends PathfinderMob implements GeoEntity {
    AnimatableInstanceCache cache;

    protected static final RawAnimation ANIMATION_IDLE = RawAnimation.begin()
            .thenLoop("animation.white_hand.idle");
    protected static final RawAnimation ANIMATION_RETURN_IDLE = RawAnimation.begin()
            .then("animation.white_hand.return", Animation.LoopType.PLAY_ONCE)
            .thenLoop("animation.white_hand.idle");
    protected static final RawAnimation ANIMATION_MOVE = RawAnimation.begin()
            .thenLoop("animation.white_hand.move");
    protected static final RawAnimation ANIMATION_SWITCH_MOVE = RawAnimation.begin()
            .then("animation.white_hand.switch", Animation.LoopType.PLAY_ONCE)
            .thenLoop("animation.white_hand.move");
    protected static final RawAnimation ANIMATION_MIDDLE_FINGER = RawAnimation.begin()
            .then("animation.white_hand.middle_finger", Animation.LoopType.PLAY_ONCE)
            .thenLoop("animation_white_hand.idle");

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 30.0)
                .add(Attributes.ATTACK_DAMAGE, 2.5)
                .add(Attributes.MAX_HEALTH, 6.0)
                .add(Attributes.MOVEMENT_SPEED, 0.15);
    }

    protected WhiteHandEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);

        cache = GeckoLibUtil.createInstanceCache(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new FloatGoal(this));
        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0));

        addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(2, new WhiteHandAttackGoal(this, 1.0, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Skeleton.class, true));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "move", 5, this::idleAnimationController));
        controllers.add(DefaultAnimations.genericLivingController(this));
    }

    protected <E extends WhiteHandEntity> PlayState idleAnimationController(final AnimationState<E> event) {
        if (event.isMoving()) {
            if (event.isCurrentAnimation(ANIMATION_IDLE)
                    || event.isCurrentAnimation(ANIMATION_RETURN_IDLE))
                return event.setAndContinue(ANIMATION_SWITCH_MOVE);

            if (event.isCurrentAnimation(ANIMATION_MOVE))
                return event.setAndContinue(ANIMATION_MOVE);

            return PlayState.CONTINUE;
        }

        if (this.lookControl.isLookingAtTarget()) {
            return event.setAndContinue(ANIMATION_MIDDLE_FINGER);
        }

        if (event.isCurrentAnimation(ANIMATION_MOVE) || event.isCurrentAnimation(ANIMATION_RETURN_IDLE))
            return event.setAndContinue(ANIMATION_RETURN_IDLE);

        return event.setAndContinue(ANIMATION_IDLE);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public static class WhiteHandAttackGoal extends MeleeAttackGoal {
        private final WhiteHandEntity hand;

        public WhiteHandAttackGoal(WhiteHandEntity hand, double p_26020_, boolean p_26021_) {
            super(hand, p_26020_, p_26021_);
            this.hand = hand;
        }

        @Override
        public void start() {
            super.start();
        }

        @Override
        public void stop() {
            super.stop();
            this.hand.setAggressive(false);
        }

        @Override
        public void tick() {
            super.tick();

            this.hand.setAggressive(this.getTicksUntilNextAttack() < this.getAttackInterval() / 2);
        }
    }
}

package dev.cacahuete.morlith.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.util.GeckoLibUtil;

public class BayanEntity extends PathfinderMob implements GeoEntity {
    AnimatableInstanceCache cache;

    protected static final RawAnimation ANIMATION_IDLE = RawAnimation.begin().thenLoop("animation.bayan.idle");
    protected static final RawAnimation ANIMATION_MOVING = RawAnimation.begin().thenLoop("animation.bayan.moving");

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes()
                .add(Attributes.FOLLOW_RANGE, 40.0)
                .add(Attributes.ATTACK_DAMAGE, 5.0)
                .add(Attributes.ARMOR, 3.5)
                .add(Attributes.MAX_HEALTH, 20.0)
                .add(Attributes.MOVEMENT_SPEED, 0.25);
    }

    public BayanEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);

        cache = GeckoLibUtil.createInstanceCache(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();

        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));

        addBehaviourGoals();
    }

    protected void addBehaviourGoals() {
        this.goalSelector.addGoal(2, new BayanAttackGoal(this, 1.0, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "idle", 5, this::idleAnimationController));
        controllers.add(DefaultAnimations.genericLivingController(this));
    }

    protected <E extends BayanEntity> PlayState idleAnimationController(final AnimationState<E> event) {
        if (!event.isMoving()) return event.setAndContinue(ANIMATION_IDLE);
        else return event.setAndContinue(ANIMATION_MOVING);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    public class BayanAttackGoal extends MeleeAttackGoal {
        private final BayanEntity bayan;

        public BayanAttackGoal(BayanEntity bayan, double p_26020_, boolean p_26021_) {
            super(bayan, p_26020_, p_26021_);
            this.bayan = bayan;
        }

        @Override
        public void start() {
            super.start();
        }

        @Override
        public void stop() {
            super.stop();
            this.bayan.setAggressive(false);
        }

        @Override
        public void tick() {
            super.tick();

            this.bayan.setAggressive(this.getTicksUntilNextAttack() < this.getAttackInterval() / 2);
        }
    }
}

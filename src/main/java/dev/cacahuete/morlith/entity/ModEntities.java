package dev.cacahuete.morlith.entity;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.entity.custom.BayanEntity;
import dev.cacahuete.morlith.entity.custom.WhiteHandEntity;
import dev.cacahuete.morlith.entity.client.BayanEntityRenderer;
import dev.cacahuete.morlith.entity.client.WhiteHandEntityRenderer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(Registries.ENTITY_TYPE, Morlith.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<BayanEntity>> BAYAN = ENTITIES.register("bayan", () ->
            EntityType.Builder.of(BayanEntity::new, MobCategory.MONSTER)
                .sized(1f, 1f)
                .build("bayan"));

    public static final DeferredHolder<EntityType<?>, EntityType<WhiteHandEntity>> WHITE_HAND = ENTITIES.register("white_hand", () ->
            EntityType.Builder.of(WhiteHandEntity::new, MobCategory.MONSTER)
                    .sized(0.6f, 1f)
                    .build("white_hand"));

    public static void register(IEventBus bus) {
        ENTITIES.register(bus);
    }

    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.BAYAN.get(), BayanEntityRenderer::new);
        event.registerEntityRenderer(ModEntities.WHITE_HAND.get(), WhiteHandEntityRenderer::new);
    }

    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.BAYAN.get(), BayanEntity.createAttributes().build());
        event.put(ModEntities.WHITE_HAND.get(), WhiteHandEntity.createAttributes().build());
    }
}

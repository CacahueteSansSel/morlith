package dev.cacahuete.morlith.model.entity;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.entity.BayanEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class BayanModel extends GeoModel<BayanEntity> {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "geo/entity/bayan.geo.json");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "textures/entity/bayan.png");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "animations/bayan.animation.json");

    @Override
    public ResourceLocation getModelResource(BayanEntity animatable) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(BayanEntity animatable) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(BayanEntity animatable) {
        return animations;
    }
}

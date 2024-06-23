package dev.cacahuete.morlith.model.entity;

import dev.cacahuete.morlith.Morlith;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.animatable.GeoAnimatable;
import software.bernie.geckolib.model.GeoModel;

public class BayanModel extends GeoModel {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "geo/example.geo.json");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "textures/entities");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "animations/example.animation.json");

    @Override
    public ResourceLocation getModelResource(GeoAnimatable animatable) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(GeoAnimatable animatable) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(GeoAnimatable animatable) {
        return animations;
    }
}

package dev.cacahuete.morlith.entity.client;

import dev.cacahuete.morlith.Morlith;
import dev.cacahuete.morlith.entity.custom.WhiteHandEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class WhiteHandModel extends GeoModel<WhiteHandEntity> {
    private final ResourceLocation model = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "geo/entity/white_hand.geo.json");
    private final ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "textures/entity/white_hand.png");
    private final ResourceLocation animations = ResourceLocation.fromNamespaceAndPath(Morlith.MODID, "animations/white_hand.animation.json");

    @Override
    public ResourceLocation getModelResource(WhiteHandEntity animatable) {
        return model;
    }

    @Override
    public ResourceLocation getTextureResource(WhiteHandEntity animatable) {
        return texture;
    }

    @Override
    public ResourceLocation getAnimationResource(WhiteHandEntity animatable) {
        return animations;
    }
}

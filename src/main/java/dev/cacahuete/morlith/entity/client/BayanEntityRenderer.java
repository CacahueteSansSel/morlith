package dev.cacahuete.morlith.entity.client;

import dev.cacahuete.morlith.entity.custom.BayanEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BayanEntityRenderer extends GeoEntityRenderer<BayanEntity> {
    public BayanEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new BayanModel());
    }
}
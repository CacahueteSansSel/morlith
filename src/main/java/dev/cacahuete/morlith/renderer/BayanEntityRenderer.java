package dev.cacahuete.morlith.renderer;

import dev.cacahuete.morlith.entity.BayanEntity;
import dev.cacahuete.morlith.model.entity.BayanModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BayanEntityRenderer extends GeoEntityRenderer<BayanEntity> {
    public BayanEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new BayanModel());
    }
}
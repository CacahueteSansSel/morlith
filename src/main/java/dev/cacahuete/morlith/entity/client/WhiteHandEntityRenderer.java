package dev.cacahuete.morlith.entity.client;

import dev.cacahuete.morlith.entity.custom.WhiteHandEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WhiteHandEntityRenderer extends GeoEntityRenderer<WhiteHandEntity> {
    public WhiteHandEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new WhiteHandModel());
    }
}
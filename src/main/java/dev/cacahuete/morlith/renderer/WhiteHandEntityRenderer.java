package dev.cacahuete.morlith.renderer;

import dev.cacahuete.morlith.entity.BayanEntity;
import dev.cacahuete.morlith.entity.WhiteHandEntity;
import dev.cacahuete.morlith.model.entity.BayanModel;
import dev.cacahuete.morlith.model.entity.WhiteHandModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class WhiteHandEntityRenderer extends GeoEntityRenderer<WhiteHandEntity> {
    public WhiteHandEntityRenderer(EntityRendererProvider.Context context) {
        super(context, new WhiteHandModel());
    }
}
package com.example.examplemod;

import net.fabricmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.tooltip.api.client.ItemTooltipCallback;

public class ExampleMod implements ModInitializer {

    @Override
    public void onInitialize(ModContainer mod) {
        // This method is invoked by the Quilt api when it is ready
        // to load your mod. You can access Quilt and Common code in this
        // project.

        // Use Quilt to bootstrap the Common mod.
        Constants.LOG.info("Hello Quilt world!");
        CommonClass.init();

        // Some code like events require special initialization from the
        // loader specific code.
        ItemTooltipCallback.EVENT.register((stack, player, context, lines) ->
                CommonClass.onItemTooltip(stack, context, lines)
        );
    }
}

package com.noeffort.basic.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Fuels implements IFuelHandler {

    public Fuels() {}

    @Override
    public int getBurnTime(ItemStack fuel) {
        if (fuel.getItem() == <ITEM>) {
            return <BURN_DURATION>;
        }
        return 0;
    }

}

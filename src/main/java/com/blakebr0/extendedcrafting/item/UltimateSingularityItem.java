package com.blakebr0.extendedcrafting.item;

import com.blakebr0.cucumber.iface.IEnableable;
import com.blakebr0.cucumber.item.BaseItem;
import com.blakebr0.extendedcrafting.config.ModConfigs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;

import java.util.function.Function;

public class UltimateSingularityItem extends BaseItem implements IEnableable {
	public UltimateSingularityItem(Function<Properties, Properties> properties) {
		super(properties.compose(p -> p.maxStackSize(16).rarity(Rarity.EPIC)));
	}

	@Override
	public boolean hasEffect(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return ModConfigs.ENABLE_SINGULARITIES.get();
	}
}

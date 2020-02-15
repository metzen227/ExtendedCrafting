package com.blakebr0.extendedcrafting.api.crafting;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.world.World;

import java.util.Optional;

/**
 * The custom recipe types added by Extended Crafting
 */
public class RecipeTypes {
    public static final IRecipeType<ICombinationRecipe> COMBINATION = new IRecipeType<ICombinationRecipe>() {
        @Override
        public <C extends IInventory> Optional<ICombinationRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((ICombinationRecipe) recipe) : Optional.empty();
        }
    };
    public static final IRecipeType<ITableRecipe> TABLE = new IRecipeType<ITableRecipe>() {
        @Override
        public <C extends IInventory> Optional<ITableRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((ITableRecipe) recipe) : Optional.empty();
        }
    };
    public static final IRecipeType<ICompressorRecipe> COMPRESSOR = new IRecipeType<ICompressorRecipe>() {
        @Override
        public <C extends IInventory> Optional<ICompressorRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((ICompressorRecipe) recipe) : Optional.empty();
        }
    };
    public static final IRecipeType<IEnderCrafterRecipe> ENDER_CRAFTER = new IRecipeType<IEnderCrafterRecipe>() {
        @Override
        public <C extends IInventory> Optional<IEnderCrafterRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((IEnderCrafterRecipe) recipe) : Optional.empty();
        }
    };
}
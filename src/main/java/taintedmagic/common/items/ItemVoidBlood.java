package taintedmagic.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.RecipeSorter;
import net.minecraftforge.oredict.RecipeSorter.Category;
import taintedmagic.api.RecipeVoidBlood;
import taintedmagic.common.TaintedMagic;
import thaumcraft.common.config.ConfigItems;

public class ItemVoidBlood extends Item
{
    public ItemVoidBlood ()
    {
        this.setCreativeTab(TaintedMagic.tabTM);
        this.setTextureName("taintedmagic:ItemVoidBlood");
        this.setUnlocalizedName("ItemVoidBlood");
        this.setContainerItem(ConfigItems.itemEssence);

        GameRegistry.addRecipe(new RecipeVoidBlood());
        RecipeSorter.register("taintedmagic:ItemVoidBlood", RecipeVoidBlood.class, Category.SHAPELESS, "");
    }

    @SideOnly (Side.CLIENT)
    public EnumRarity getRarity (ItemStack stack)
    {
        return EnumRarity.rare;
    }
}

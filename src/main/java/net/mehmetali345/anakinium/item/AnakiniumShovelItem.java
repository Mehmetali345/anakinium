
package net.mehmetali345.anakinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mehmetali345.anakinium.AnakiniumModElements;

import java.util.List;

@AnakiniumModElements.ModElement.Tag
public class AnakiniumShovelItem extends AnakiniumModElements.ModElement {
	@ObjectHolder("anakinium:anakinium_shovel")
	public static final Item block = null;
	public AnakiniumShovelItem(AnakiniumModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3256;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AnakiniumKulcesiItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Kadim metalden d\u00F6v\u00FClm\u00FC\u015F k\u00FCrek."));
			}
		}.setRegistryName("anakinium_shovel"));
	}
}

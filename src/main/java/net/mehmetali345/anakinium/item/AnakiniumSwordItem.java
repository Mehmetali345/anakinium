
package net.mehmetali345.anakinium.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mehmetali345.anakinium.AnakiniumModElements;

import java.util.List;

@AnakiniumModElements.ModElement.Tag
public class AnakiniumSwordItem extends AnakiniumModElements.ModElement {
	@ObjectHolder("anakinium:anakinium_sword")
	public static final Item block = null;
	public AnakiniumSwordItem(AnakiniumModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3256;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AnakiniumKulcesiItem.block, (int) (1)));
			}
		}, 3, 1f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Kadim metalden d\u00F6v\u00FClm\u00FC\u015F k\u0131l\u0131\u00E7."));
			}
		}.setRegistryName("anakinium_sword"));
	}
}

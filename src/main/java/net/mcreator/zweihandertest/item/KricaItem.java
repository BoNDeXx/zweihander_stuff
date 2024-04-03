
package net.mcreator.zweihandertest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.zweihandertest.itemgroup.TestItemGroup;
import net.mcreator.zweihandertest.ZweihanderTestModElements;

import java.util.List;

@ZweihanderTestModElements.ModElement.Tag
public class KricaItem extends ZweihanderTestModElements.ModElement {
	@ObjectHolder("zweihander_test:krica")
	public static final Item block = null;

	public KricaItem(ZweihanderTestModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TestItemGroup.tab).maxStackSize(8).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("krica");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("ZweihanderRP"));
		}
	}
}
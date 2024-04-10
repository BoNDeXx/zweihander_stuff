
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zweihanderrp.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.zweihanderrp.item.VeryrichtophelmItem;
import net.mcreator.zweihanderrp.item.TurbanItem;
import net.mcreator.zweihanderrp.item.TophelmItem;
import net.mcreator.zweihanderrp.item.StoneShovelHeadItem;
import net.mcreator.zweihanderrp.item.StonePickaxeHeadItem;
import net.mcreator.zweihanderrp.item.StoneKnifeHeadItem;
import net.mcreator.zweihanderrp.item.StoneHoeHeadItem;
import net.mcreator.zweihanderrp.item.StoneAxeHeadItem;
import net.mcreator.zweihanderrp.item.SimpleCuirassItem;
import net.mcreator.zweihanderrp.item.SchichtItem;
import net.mcreator.zweihanderrp.item.SalletItem;
import net.mcreator.zweihanderrp.item.RopeItem;
import net.mcreator.zweihanderrp.item.RomanarmorItem;
import net.mcreator.zweihanderrp.item.RichKlappviserItem;
import net.mcreator.zweihanderrp.item.RichCuirassItem;
import net.mcreator.zweihanderrp.item.RedtophelmItem;
import net.mcreator.zweihanderrp.item.RedPaintedPauldronsItem;
import net.mcreator.zweihanderrp.item.PauldronsStandardLeatherItem;
import net.mcreator.zweihanderrp.item.PauldronsItem;
import net.mcreator.zweihanderrp.item.PaintedBarbuteItem;
import net.mcreator.zweihanderrp.item.NordicHelmet5Item;
import net.mcreator.zweihanderrp.item.NordicHelmet4Item;
import net.mcreator.zweihanderrp.item.NordicHelmet3Item;
import net.mcreator.zweihanderrp.item.NordicHelmet2Item;
import net.mcreator.zweihanderrp.item.NordicHelmet1Item;
import net.mcreator.zweihanderrp.item.NodicHelmet6Item;
import net.mcreator.zweihanderrp.item.MailStandardItem;
import net.mcreator.zweihanderrp.item.LeatherBrigandineItem;
import net.mcreator.zweihanderrp.item.KricaItem;
import net.mcreator.zweihanderrp.item.KoifeItem;
import net.mcreator.zweihanderrp.item.IberianHelmetItem;
import net.mcreator.zweihanderrp.item.HZhelmeteRichItem;
import net.mcreator.zweihanderrp.item.HZhelmeteItem;
import net.mcreator.zweihanderrp.item.FullCuirassItem;
import net.mcreator.zweihanderrp.item.EngravedbarbuteItem;
import net.mcreator.zweihanderrp.item.EngravedTophelmItem;
import net.mcreator.zweihanderrp.item.EngravedPauldronsItem;
import net.mcreator.zweihanderrp.item.EngravedCuirassItem;
import net.mcreator.zweihanderrp.item.CrudeGovnoCuirassItem;
import net.mcreator.zweihanderrp.item.CrudeCuirassItem;
import net.mcreator.zweihanderrp.item.CoalDustItem;
import net.mcreator.zweihanderrp.item.ChugunokItem;
import net.mcreator.zweihanderrp.item.BluedsalletItem;
import net.mcreator.zweihanderrp.item.BluedPauldronsItem;
import net.mcreator.zweihanderrp.item.BluedKlapvisorItem;
import net.mcreator.zweihanderrp.item.BluedCuirassItem;
import net.mcreator.zweihanderrp.item.BlueTunik3Item;
import net.mcreator.zweihanderrp.item.BlueTunik2Item;
import net.mcreator.zweihanderrp.item.BlueTunik1Item;
import net.mcreator.zweihanderrp.item.BlackBluedCuirassItem;
import net.mcreator.zweihanderrp.item.BascinetwithklappvisorItem;
import net.mcreator.zweihanderrp.item.BarbuteItem;
import net.mcreator.zweihanderrp.item.BacinetItem;
import net.mcreator.zweihanderrp.item.ArabicTunikItem;
import net.mcreator.zweihanderrp.item.ArabicStandardPauldronsItem;
import net.mcreator.zweihanderrp.block.display.VSTUPlenieDisplayItem;
import net.mcreator.zweihanderrp.ZweihanderrpMod;

public class ZweihanderrpModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ZweihanderrpMod.MODID);
	public static final RegistryObject<Item> KRICA = REGISTRY.register("krica", () -> new KricaItem());
	public static final RegistryObject<Item> SYRODUT = block(ZweihanderrpModBlocks.SYRODUT);
	public static final RegistryObject<Item> SCHICHT = REGISTRY.register("schicht", () -> new SchichtItem());
	public static final RegistryObject<Item> CHUGUNOK = REGISTRY.register("chugunok", () -> new ChugunokItem());
	public static final RegistryObject<Item> COAL_DUST = REGISTRY.register("coal_dust", () -> new CoalDustItem());
	public static final RegistryObject<Item> LAND_ROCK = block(ZweihanderrpModBlocks.LAND_ROCK);
	public static final RegistryObject<Item> STONE_SHOVEL_HEAD = REGISTRY.register("stone_shovel_head", () -> new StoneShovelHeadItem());
	public static final RegistryObject<Item> STONE_AXE_HEAD = REGISTRY.register("stone_axe_head", () -> new StoneAxeHeadItem());
	public static final RegistryObject<Item> STONE_HOE_HEAD = REGISTRY.register("stone_hoe_head", () -> new StoneHoeHeadItem());
	public static final RegistryObject<Item> STONE_PICKAXE_HEAD = REGISTRY.register("stone_pickaxe_head", () -> new StonePickaxeHeadItem());
	public static final RegistryObject<Item> STONE_KNIFE_HEAD = REGISTRY.register("stone_knife_head", () -> new StoneKnifeHeadItem());
	public static final RegistryObject<Item> ROPE = REGISTRY.register("rope", () -> new RopeItem());
	public static final RegistryObject<Item> NORDIC_HELMET_1_HELMET = REGISTRY.register("nordic_helmet_1_helmet", () -> new NordicHelmet1Item.Helmet());
	public static final RegistryObject<Item> NORDIC_HELMET_2_HELMET = REGISTRY.register("nordic_helmet_2_helmet", () -> new NordicHelmet2Item.Helmet());
	public static final RegistryObject<Item> NORDIC_HELMET_3_HELMET = REGISTRY.register("nordic_helmet_3_helmet", () -> new NordicHelmet3Item.Helmet());
	public static final RegistryObject<Item> NORDIC_HELMET_4_HELMET = REGISTRY.register("nordic_helmet_4_helmet", () -> new NordicHelmet4Item.Helmet());
	public static final RegistryObject<Item> NORDIC_HELMET_5_HELMET = REGISTRY.register("nordic_helmet_5_helmet", () -> new NordicHelmet5Item.Helmet());
	public static final RegistryObject<Item> NODIC_HELMET_6_HELMET = REGISTRY.register("nodic_helmet_6_helmet", () -> new NodicHelmet6Item.Helmet());
	public static final RegistryObject<Item> BACINET_HELMET = REGISTRY.register("bacinet_helmet", () -> new BacinetItem.Helmet());
	public static final RegistryObject<Item> BARBUTE_HELMET = REGISTRY.register("barbute_helmet", () -> new BarbuteItem.Helmet());
	public static final RegistryObject<Item> SALLET_HELMET = REGISTRY.register("sallet_helmet", () -> new SalletItem.Helmet());
	public static final RegistryObject<Item> BASCINETWITHKLAPPVISOR_HELMET = REGISTRY.register("bascinetwithklappvisor_helmet", () -> new BascinetwithklappvisorItem.Helmet());
	public static final RegistryObject<Item> H_ZHELMETE_HELMET = REGISTRY.register("h_zhelmete_helmet", () -> new HZhelmeteItem.Helmet());
	public static final RegistryObject<Item> ENGRAVED_TOPHELM_HELMET = REGISTRY.register("engraved_tophelm_helmet", () -> new EngravedTophelmItem.Helmet());
	public static final RegistryObject<Item> TOPHELM_HELMET = REGISTRY.register("tophelm_helmet", () -> new TophelmItem.Helmet());
	public static final RegistryObject<Item> REDTOPHELM_HELMET = REGISTRY.register("redtophelm_helmet", () -> new RedtophelmItem.Helmet());
	public static final RegistryObject<Item> VERYRICHTOPHELM_HELMET = REGISTRY.register("veryrichtophelm_helmet", () -> new VeryrichtophelmItem.Helmet());
	public static final RegistryObject<Item> RICH_KLAPPVISER_HELMET = REGISTRY.register("rich_klappviser_helmet", () -> new RichKlappviserItem.Helmet());
	public static final RegistryObject<Item> H_ZHELMETE_RICH_HELMET = REGISTRY.register("h_zhelmete_rich_helmet", () -> new HZhelmeteRichItem.Helmet());
	public static final RegistryObject<Item> ENGRAVEDBARBUTE_HELMET = REGISTRY.register("engravedbarbute_helmet", () -> new EngravedbarbuteItem.Helmet());
	public static final RegistryObject<Item> PAINTED_BARBUTE_HELMET = REGISTRY.register("painted_barbute_helmet", () -> new PaintedBarbuteItem.Helmet());
	public static final RegistryObject<Item> BLUEDSALLET_HELMET = REGISTRY.register("bluedsallet_helmet", () -> new BluedsalletItem.Helmet());
	public static final RegistryObject<Item> BLUED_KLAPVISOR_HELMET = REGISTRY.register("blued_klapvisor_helmet", () -> new BluedKlapvisorItem.Helmet());
	public static final RegistryObject<Item> ROMANARMOR_HELMET = REGISTRY.register("romanarmor_helmet", () -> new RomanarmorItem.Helmet());
	public static final RegistryObject<Item> ROMANARMOR_CHESTPLATE = REGISTRY.register("romanarmor_chestplate", () -> new RomanarmorItem.Chestplate());
	public static final RegistryObject<Item> MAIL_STANDARD_CHESTPLATE = REGISTRY.register("mail_standard_chestplate", () -> new MailStandardItem.Chestplate());
	public static final RegistryObject<Item> KOIFE_HELMET = REGISTRY.register("koife_helmet", () -> new KoifeItem.Helmet());
	public static final RegistryObject<Item> SIMPLE_CUIRASS_CHESTPLATE = REGISTRY.register("simple_cuirass_chestplate", () -> new SimpleCuirassItem.Chestplate());
	public static final RegistryObject<Item> FULL_CUIRASS_CHESTPLATE = REGISTRY.register("full_cuirass_chestplate", () -> new FullCuirassItem.Chestplate());
	public static final RegistryObject<Item> CRUDE_CUIRASS_CHESTPLATE = REGISTRY.register("crude_cuirass_chestplate", () -> new CrudeCuirassItem.Chestplate());
	public static final RegistryObject<Item> PAULDRONS_CHESTPLATE = REGISTRY.register("pauldrons_chestplate", () -> new PauldronsItem.Chestplate());
	public static final RegistryObject<Item> CRUDE_GOVNO_CUIRASS_CHESTPLATE = REGISTRY.register("crude_govno_cuirass_chestplate", () -> new CrudeGovnoCuirassItem.Chestplate());
	public static final RegistryObject<Item> PAULDRONS_STANDARD_LEATHER_CHESTPLATE = REGISTRY.register("pauldrons_standard_leather_chestplate", () -> new PauldronsStandardLeatherItem.Chestplate());
	public static final RegistryObject<Item> LEATHER_BRIGANDINE_CHESTPLATE = REGISTRY.register("leather_brigandine_chestplate", () -> new LeatherBrigandineItem.Chestplate());
	public static final RegistryObject<Item> RED_PAINTED_PAULDRONS_CHESTPLATE = REGISTRY.register("red_painted_pauldrons_chestplate", () -> new RedPaintedPauldronsItem.Chestplate());
	public static final RegistryObject<Item> ENGRAVED_PAULDRONS_CHESTPLATE = REGISTRY.register("engraved_pauldrons_chestplate", () -> new EngravedPauldronsItem.Chestplate());
	public static final RegistryObject<Item> ENGRAVED_CUIRASS_CHESTPLATE = REGISTRY.register("engraved_cuirass_chestplate", () -> new EngravedCuirassItem.Chestplate());
	public static final RegistryObject<Item> RICH_CUIRASS_CHESTPLATE = REGISTRY.register("rich_cuirass_chestplate", () -> new RichCuirassItem.Chestplate());
	public static final RegistryObject<Item> BLUED_CUIRASS_CHESTPLATE = REGISTRY.register("blued_cuirass_chestplate", () -> new BluedCuirassItem.Chestplate());
	public static final RegistryObject<Item> BLACK_BLUED_CUIRASS_CHESTPLATE = REGISTRY.register("black_blued_cuirass_chestplate", () -> new BlackBluedCuirassItem.Chestplate());
	public static final RegistryObject<Item> BLUED_PAULDRONS_CHESTPLATE = REGISTRY.register("blued_pauldrons_chestplate", () -> new BluedPauldronsItem.Chestplate());
	public static final RegistryObject<Item> ARABIC_STANDARD_PAULDRONS_CHESTPLATE = REGISTRY.register("arabic_standard_pauldrons_chestplate", () -> new ArabicStandardPauldronsItem.Chestplate());
	public static final RegistryObject<Item> TURBAN_HELMET = REGISTRY.register("turban_helmet", () -> new TurbanItem.Helmet());
	public static final RegistryObject<Item> IBERIAN_HELMET_HELMET = REGISTRY.register("iberian_helmet_helmet", () -> new IberianHelmetItem.Helmet());
	public static final RegistryObject<Item> ARABIC_TUNIK_LEGGINGS = REGISTRY.register("arabic_tunik_leggings", () -> new ArabicTunikItem.Leggings());
	public static final RegistryObject<Item> BLUE_TUNIK_1_LEGGINGS = REGISTRY.register("blue_tunik_1_leggings", () -> new BlueTunik1Item.Leggings());
	public static final RegistryObject<Item> BLUE_TUNIK_2_LEGGINGS = REGISTRY.register("blue_tunik_2_leggings", () -> new BlueTunik2Item.Leggings());
	public static final RegistryObject<Item> BLUE_TUNIK_3_LEGGINGS = REGISTRY.register("blue_tunik_3_leggings", () -> new BlueTunik3Item.Leggings());
	public static final RegistryObject<Item> VSTU_PLENIE = REGISTRY.register(ZweihanderrpModBlocks.VSTU_PLENIE.getId().getPath(), () -> new VSTUPlenieDisplayItem(ZweihanderrpModBlocks.VSTU_PLENIE.get(), new Item.Properties()));
	public static final RegistryObject<Item> GOVNO_SMALL_ANVIL = block(ZweihanderrpModBlocks.GOVNO_SMALL_ANVIL);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}

package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	
	private static final Item FIRST_ITEM = (new Item("+5 Dexterity Vest", 10, 20));
	private static final Item SECOND_ITEM = (new Item("+5 Dexterity Vest", 0, 20));
	private static final Item THIRD_ITEM = (new Item("+5 Dexterity Vest", 10, 0));
	private static final Item AGED_BRIE= (new Item("Aged Brie", 2, 0));
	private static final Item AGED_BRIE_2 = (new Item("Aged Brie", 10, 50));
	
	
	@Test
	public void testNoConditionSellinAndQualityDecrease()
	{
		GildedRose.updateItem(FIRST_ITEM);
		assertEquals(FIRST_ITEM.getSellIn(),9);
		assertEquals(FIRST_ITEM.getQuality(),19);
	}
	
	@Test
	public void testSellInInferiorToZeroSellinAndQualityUpdate()
	{
		GildedRose.updateItem(SECOND_ITEM);
		assertEquals(SECOND_ITEM.getSellIn(),-1);
		assertEquals(SECOND_ITEM.getQuality(),18);
	}

	@Test
	public void testQualityInferiorToZeroSellinAndQualityUpdate()
	{
		GildedRose.updateItem(THIRD_ITEM);
		assertEquals(THIRD_ITEM.getSellIn(),9);
		assertEquals(THIRD_ITEM.getQuality(),0);
	}
	
	@Test
	public void testAgedBrieSellinAndQualityUpdate()
	{
		GildedRose.updateItem(AGED_BRIE);
		assertEquals(AGED_BRIE.getSellIn(),1);
		assertEquals(AGED_BRIE.getQuality(),1);
	}
	
	@Test
	public void testQualitySuperiorToFifthySellinAndQualityUpdate()
	{
		GildedRose.updateItem(AGED_BRIE_2);
		assertEquals(AGED_BRIE_2.getSellIn(),9);
		assertEquals(AGED_BRIE_2.getQuality(),50);
	}


}
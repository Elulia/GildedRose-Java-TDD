package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	
	private static final Item FIRST_ITEM = (new Item("+5 Dexterity Vest", 10, 20));
	private static final Item SECOND_ITEM = (new Item("+5 Dexterity Vest", 0, 20));
	
	@Test
	public void testNoConditionSellinAndQualityDecrease()
	{
		GildedRose.updateItem(FIRST_ITEM);
		assertEquals(FIRST_ITEM.getSellIn(),9);
		assertEquals(FIRST_ITEM.getQuality(),19);
	}
	
	@Test
	public void testSellInInferiorToZeroSellinAndQualityDecrease()
	{
		GildedRose.updateItem(SECOND_ITEM);
		assertEquals(SECOND_ITEM.getSellIn(),-1);
		assertEquals(SECOND_ITEM.getQuality(),18);
	}

}
package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	
	
	private static final Item firstItem = (new Item("+5 Dexterity Vest", 10, 20));
	
	@Test
	public void testSellinAndQualityDecrease()
	{
		GildedRose.updateItem(firstItem);
		assertEquals(firstItem.getSellIn(),9);
		assertEquals(firstItem.getQuality(),19);
	}

}
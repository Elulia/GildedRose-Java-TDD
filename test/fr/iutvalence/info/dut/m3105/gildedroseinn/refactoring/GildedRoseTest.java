package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class GildedRoseTest
{
	
	@Before
	public Item initialisationItemList()
	{
		return (new Item("+5 Dexterity Vest", 10, 20));
	}
	@Test
	public void testSellinAndQualityDecrease()
	{
		Item firstItem = initialisationItemList();
		GildedRose.updateItem(firstItem);
		assertEquals(firstItem.getSellIn(),9);
		assertEquals(firstItem.getQuality(),19);
	}

}
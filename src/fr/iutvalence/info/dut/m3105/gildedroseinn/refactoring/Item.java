package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

public class Item
{
	private final String name;
	private int sellIn;
	private int quality;

	public Item(String name, int sellIn, int quality)
	{
		this.name = name;
		this.sellIn = sellIn;
		this.quality = quality;
	}

	public String getName()
	{
		return this.name;
	}

	public int getSellIn()
	{
		return this.sellIn;
	}

	public int getQuality()
	{
		return this.quality;
	}

	public void setQuality(int quality)
	{
		this.quality = quality;
	}
	
	public void decreaseSellIn(){
		this.sellIn -=1;
	}
	
	public void decreaseQuality(){
		this.quality -=1;
	}
	
	public boolean isOutdated(){
		if (this.sellIn < 0){
			return true;
		}
		return false;
	}
	
	
	public void resetQuality(){
		this.setQuality(0);
	}
}

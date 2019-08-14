package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private PackType packType; //"Business", "Adults" or "Kids"
	
	public GiftPack(Address addr, PackType type)
	{
		this.giftItems = new ArrayList<>();
		this.shippingAddress = addr;
		this.packType = type;
	}
	
	public void add(GiftItem item)
	{
		giftItems.add(item);
	}
	
	public List<GiftItem> getGiftItems()
	{
		return giftItems;
	}
	
	public Address getShippingAddress()
	{
		return shippingAddress;
	}
	
	public PackType getPackType()
	{
		return packType;
	}
	
	public float calculateCost()
	{
		float sum = 0;
		
		for(GiftItem item : giftItems)
		{
			sum += item.getPackaging().getCost();
		}
		
		System.out.println("Total cost: " + sum);
		
		return sum;
	}
}

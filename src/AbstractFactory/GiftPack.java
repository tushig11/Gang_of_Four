package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;
	private String packType; //"Business", "Adults", or "Kids"
	
	GiftPack(String type){
		this.giftItems = new ArrayList<>();
		this.packType = type;
	}
	
	public Address getShippingAddress() {
		return shippingAddress;
	}
	
	public String getPackType() {
		return packType;
	}
	
	public List<GiftItem> getGiftItems() {
		return giftItems;
	}
	
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public void addItem(GiftItem item){
		this.giftItems.add(item);
	}
}

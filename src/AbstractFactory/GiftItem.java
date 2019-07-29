package AbstractFactory;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private String packagingType; //"bag", "box", or "wrap".
	private Packaging packaging;
	
	GiftItem(String id , String name, String description, String type, Packaging pack){
		this.giftId = id;
		this.giftName = name;
		this.description = description;
		this.packagingType = type;
		this.packaging = pack;
	}
}

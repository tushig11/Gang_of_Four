package AbstractFactory;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private PackagingType packagingType; //"bag", "box", or "wrap".
	private Packaging packaging;
	
	public GiftItem(String id, String name, String desc, PackagingType type)
	{
		this.giftId = id;
		this.giftName = name;
		this.description = desc;
		this.packagingType = type;
	}
	
	public String getGiftId()
	{
		return giftId;
	}
	
	public String getGiftName()
	{
		return giftName;
	}
	
	public String getDesc()
	{
		return description;
	}
	
	public PackagingType getPackagingType()
	{
		return packagingType;
	}
	
	public Packaging getPackaging()
	{
		return packaging;
	}
	
	public void setPackaging(Packaging packaging)
	{
		this.packaging = packaging;
	}
	
}

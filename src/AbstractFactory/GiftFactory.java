package AbstractFactory;

public class GiftFactory implements IGiftFactory {
	private GiftPack giftPack = null;
	
	public GiftFactory(GiftPack giftPack) {
		// TODO Auto-generated constructor stub
		this.giftPack = giftPack;
	}
	
	@Override
	public void createPackage() {
		
		for(GiftItem item : giftPack.getGiftItems())
		{
			if(giftPack.getPackType().equals(PackType.BUSINESS))
			{
				if(item.getPackagingType().equals(PackagingType.BAG))
				{
					item.setPackaging(new MerchantCollection());
				}	
				else if(item.getPackagingType().equals(PackagingType.BOX))
				{
					item.setPackaging(new HardPlastic());
				}
				else if(item.getPackagingType().equals(PackagingType.WRAP))
				{
					item.setPackaging(new HolidaySurprise());
				}
			}
			else if(giftPack.getPackType().equals(PackType.ADULTS))
			{
				if(item.getPackagingType().equals(PackagingType.BAG))
				{
					item.setPackaging(new ReusableShopper());
				}	
				else if(item.getPackagingType().equals(PackagingType.BOX))
				{
					item.setPackaging(new PlainPaper());
				}
				else if(item.getPackagingType().equals(PackagingType.WRAP))
				{
					item.setPackaging(new EverydayValue());
				}
			}
			else if(giftPack.getPackType().equals(PackType.KIDS))
			{
				if(item.getPackagingType().equals(PackagingType.BAG))
				{
					item.setPackaging(new Micky());
				}	
				else if(item.getPackagingType().equals(PackagingType.BOX))
				{
					item.setPackaging(new Cartoon());
				}
				else if(item.getPackagingType().equals(PackagingType.WRAP))
				{
					item.setPackaging(new HappyKid());
				}
			}
			
		}
		
	}

	
}

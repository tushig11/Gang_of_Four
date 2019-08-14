package AbstractFactory;

public class Client {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		GiftItem gift1 = new GiftItem("1", "A", "aaa", PackagingType.BAG);
		GiftItem gift2 = new GiftItem("1", "A", "aaa", PackagingType.BOX);
		GiftItem gift3 = new GiftItem("1", "A", "aaa", PackagingType.WRAP);
		
		GiftPack giftPack1 = new GiftPack(new Address("","","","",""), PackType.ADULTS);
		giftPack1.add(gift1);
		giftPack1.add(gift2);
		giftPack1.add(gift3);
		
		GiftPack giftPack2 = new GiftPack(new Address("","","","",""), PackType.BUSINESS);
		giftPack2.add(gift1);
		giftPack2.add(gift2);
		giftPack2.add(gift3);
		
		GiftPack giftPack3 = new GiftPack(new Address("","","","",""), PackType.KIDS);
		giftPack3.add(gift1);
		giftPack3.add(gift2);
		giftPack3.add(gift3);
		
		IGiftFactory factory1 = new GiftFactory(giftPack1);
		factory1.createPackage();
		
		giftPack1.calculateCost();
		
		IGiftFactory factory2 = new GiftFactory(giftPack2);
		factory2.createPackage();
		
		giftPack2.calculateCost();
		
		IGiftFactory factory3 = new GiftFactory(giftPack3);
		factory3.createPackage();
		
		giftPack3.calculateCost();
	}

}

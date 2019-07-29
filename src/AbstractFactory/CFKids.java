package AbstractFactory;

public class CFKids implements PackFactory{

	@Override
	public WidgetBag createBag() {
		return new CPKidsBag();
	}

	@Override
	public WidgetBox createBox() {
		return new CPKidsBox();
	}

	@Override
	public WidgetWrap createWrap() {
		return new CPKidsWrap();
	}

}

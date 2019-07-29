package AbstractFactory;

public class CFAdults implements PackFactory{

	@Override
	public WidgetBag createBag() {
		return new CPAdultsBag();
	}

	@Override
	public WidgetBox createBox() {
		// TODO Auto-generated method stub
		return new CPAdultsBox();
	}

	@Override
	public WidgetWrap createWrap() {
		// TODO Auto-generated method stub
		return new CPAdultsWrap();
	}

}

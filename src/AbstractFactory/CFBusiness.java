package AbstractFactory;

public class CFBusiness implements PackFactory{

	@Override
	public WidgetBag createBag() {
		return new CPBusinessBag();
	}

	@Override
	public WidgetBox createBox() {
		return new CPBusinessBox();
	}

	@Override
	public WidgetWrap createWrap() {
		return new CPBusinessWrap();
	}

}

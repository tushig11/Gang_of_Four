package AbstractFactory;

public class CPBusinessBag extends WidgetBag implements Packaging{

	@Override
	public double getCost() {
		return 0.5;
	}

}

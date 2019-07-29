package AbstractFactory;

public interface PackFactory {
	public abstract WidgetBag createBag();
	public abstract WidgetBox createBox();
	public abstract WidgetWrap createWrap();
}

package AbstractFactory;

public interface PackFactory {
	public abstract BagWidget createBag();
	public abstract BoxWidget createBox();
	public abstract WrapWidget createWrap();
}

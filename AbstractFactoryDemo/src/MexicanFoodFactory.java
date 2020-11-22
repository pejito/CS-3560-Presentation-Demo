
public class MexicanFoodFactory implements AbstractFoodFactory {

	@Override
	public Food makeFood(String itemName, int quantity) {
		return new MexicanFood(itemName, quantity);
	}
}

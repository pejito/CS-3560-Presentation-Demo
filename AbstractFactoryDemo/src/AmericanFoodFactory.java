
public class AmericanFoodFactory implements AbstractFoodFactory {

	@Override
	public Food makeFood(String itemName, int quantity) {
		return new AmericanFood(itemName, quantity);
	}

	
}

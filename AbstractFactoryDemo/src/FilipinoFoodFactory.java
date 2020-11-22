
public class FilipinoFoodFactory implements AbstractFoodFactory {

	@Override
	public Food makeFood(String itemName, int quantity) {
		return new FilipinoFood(itemName, quantity);
	}
	
	
}

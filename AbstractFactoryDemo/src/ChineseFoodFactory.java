
public class ChineseFoodFactory implements AbstractFoodFactory {

	@Override
	public Food makeFood(String itemName, int quantity) {
		return new ChineseFood(itemName, quantity);
	}

}


public class Consumer {
	
	public Food orderFood(String name, int quantity) {
		AbstractFoodFactory factory = null;
		if(name.contains("jollibee") || name.contains("adobo")) {
			factory = new FilipinoFoodFactory();
		}else if(name.contains("burger") || name.contains("hotdog")) {
			factory = new AmericanFoodFactory();
		}else if(name.contains("taco") || name.contains("burrito")) {
			factory = new MexicanFoodFactory();
		}else if(name.contains("chowmein") || name.contains("char siu")) {
			factory = new ChineseFoodFactory();
		}
		if(factory != null) {
			return factory.makeFood(name, quantity);
		}
		else {
			return null;
		}
		
	}
}

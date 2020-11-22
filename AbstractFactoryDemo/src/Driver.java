
public class Driver {

	public static void main(String[] args) {
		Consumer jim = new Consumer();
		
		Food food1 = jim.orderFood("jollibee", 5);
		food1.payFor();
		food1.eat();
		food1.throwAway();
		
		
		Food food2 = jim.orderFood("burrito", 2);
		food2.payFor();
		food2.eat();
		food2.throwAway();
	}

}

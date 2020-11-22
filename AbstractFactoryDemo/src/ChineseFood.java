
public class ChineseFood implements Food {
	
	private String itemName;
	private int quantity;
	private boolean delivered;
	
	public ChineseFood(String item, int quantity) {
		this.itemName = item;
		this.quantity = quantity;
		System.out.println("Chinese food of type: " + item + " with a quantity of " + quantity);
	}
	
	
	
	public boolean hasBeenDelivered() {
		return delivered;
	}
	
	public void deliver(boolean deliveryStatus) {
		this.delivered = deliveryStatus;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String newName) {
		this.itemName = newName;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	@Override
	public void eat() {
		System.out.println("Chinese food is being eaten");
	}

	@Override
	public void payFor() {
		System.out.println("Paid for Chinese food");
	}

	@Override
	public void throwAway() {
		System.out.println("Finished the Chinese food and threw it away");
	}

}

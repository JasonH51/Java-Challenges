package OOP_Challenge;

public class Burger extends Additions {
	private double price;

	public Burger() {
		super();
		this.price = 5d;
	}

	public Burger(boolean pickles, boolean cheese, boolean lettuce) {
		super(pickles, cheese, lettuce);
		this.price = super.checkToppings() + 5d;
	}

	public double getPrice() {
		return price;
	}

	public void addCharge(double price) {
		this.price += price;
	}

}

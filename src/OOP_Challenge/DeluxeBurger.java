package OOP_Challenge;

public class DeluxeBurger extends Burger {
	private boolean drink;
	private boolean chips;

	public DeluxeBurger() {
		super();
		this.drink = true;
		this.chips = true;
	}

	public DeluxeBurger(boolean drink, boolean chips) {
		super(false, false, false);
		this.drink = drink;
		this.chips = chips;
	}

	public boolean isDrink() {
		return drink;
	}

	public void setDrink(boolean drink) {
		this.drink = drink;
	}

	public boolean isChips() {
		return chips;
	}

	public void setChips(boolean chips) {
		this.chips = chips;
	}

	@Override
	public double getPrice() {
		if(drink) {
			super.addCharge(2d);
		}
		if(chips) {
			super.addCharge(1d);
		}
		return super.getPrice();
	}
}

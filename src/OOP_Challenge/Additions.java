package OOP_Challenge;

public class Additions {
	private boolean pickles;
	private boolean cheese;
	private boolean lettuce;
	private double total;

	public Additions() {
		pickles = false;
		cheese = false;
		lettuce = false;
	}

	public Additions(boolean pickles, boolean cheese, boolean lettuce) {
		this.pickles = pickles;
		this.cheese = cheese;
		this.lettuce = lettuce;
		this.total = 0d;
	}

	private double addToppings() {
		double pickles = .5d;
		double cheese = .5d;
		double lettuce = .5d;

		if (this.pickles) {
			total += pickles;
			System.out.println("Added Pickles");
		}
		if (this.cheese) {
			total += cheese;
			System.out.println("Added cheese");
		}
		if (this.lettuce) {
			total += lettuce;
			System.out.println("Added lettuce");
		}
		return this.total;
	}

	public double checkToppings() {
		if (pickles || cheese || lettuce) {
			return addToppings();
		} else {
			return 0d;
		}

	}

}

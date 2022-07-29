package OOP_Challenge;

public class HealthyBurger extends Burger {
	private String breadType;
	private boolean veggyPatty;
	private boolean greenPeppers;

	public HealthyBurger() {
		super();
		veggyPatty = true;
		greenPeppers = true;
	}

	public HealthyBurger(boolean pickles, boolean cheese, boolean lettuce, boolean veggyPatty, boolean greenPeppers,
			String breadType) {
		super(pickles, cheese, lettuce);
		this.veggyPatty = veggyPatty;
		this.greenPeppers = greenPeppers;
		this.breadType = breadType;
	}
	
	@Override
	public double getPrice() {
		if (veggyPatty) {
			super.addCharge(1d);
		}
		if (greenPeppers) {
			super.addCharge(1d);
		}
		return super.getPrice();
	}

	public String getBreadType() {
		return breadType;
	}

}

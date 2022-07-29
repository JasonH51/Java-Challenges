package OOP_Challenge;

public class Main {

	public static void main(String[] args) {
		Burger burger = new Burger(true, false, true);
		HealthyBurger healthyBurger = new HealthyBurger(true, true, true, true, true, "rye");
		DeluxeBurger deluxeBurger = new DeluxeBurger(false, true);

		System.out.println("base burger price " + burger.getPrice());
		System.out.println("healthyBurger price " + healthyBurger.getPrice());
		System.out.println("deluxeBurger price " + deluxeBurger.getPrice());
	}

}

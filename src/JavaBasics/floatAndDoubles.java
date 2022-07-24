package JavaBasics;

public class floatAndDoubles {
	
	public static void main(String[] args) {
		// you can add f or d to the end to define the type just line with a long number "L"
		float myFloat = 5.25f;
		double myDouble = 5.25d;
		
		float typeCastingFloat = (float) (5.25);
		
		System.out.println(typeCastingFloat);
		// java and many modern computers optimized using double numbers over float.
		// Its likely best to use double over float unless space/memory is an issue over speed.
	}

}

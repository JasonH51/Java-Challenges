package JavaBasics;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte smallestNum;
		short secondSmallestNum;
		int number = 123;
		long largestNum = 100L;
		float smallFloatNum;
		double largerFloatNum;
		String string = "text";
		boolean trueOrFalse = true;
		char singleLetter = 'D';
		
		byte minByte = Byte.MIN_VALUE;
		byte maxByte = Byte.MAX_VALUE;
		System.out.println("Smallest byte value " + minByte);
		System.out.println("Largest byte value " + maxByte);
		
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("Smallest Short value " + minShort);
		System.out.println("Largest Short value " + maxShort);
		
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("Smallest int value " + minInt);
		System.out.println("Largest int value " + maxInt);
		
		long minlong = Long.MIN_VALUE;
		long maxlong = Long.MAX_VALUE;
		System.out.println("Smallest long value " + minlong);
		System.out.println("Largest long value " + maxlong);
		
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("Smallest Float value " + minFloat);
		System.out.println("Largest Float value " + maxFloat);
		
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("Smallest Double value " + minDouble);
		System.out.println("Largest Double value " + maxDouble);
		
		//type casting
		short biggestShort = 32767;
		
		int myTotal = minInt / 2;
		
		//bytes in an expression will be converted into an int so we use type casting to change the type. int is defaulted
		byte typeCastByte = (byte) (minByte / 2);
		
		System.out.println(typeCastByte);
	}

}

package teamF.calc;

/**
 * This class F2 is used to find the tangent value as per the Function F2
 * 
 * @author WILLIAM MOSES STALIN JEBADOSS
 * @studentID 40186127
 *
 */
public class F2 {

	final static double pi = 3.14159;

	/**
	 * This function returns the tangent value for the angle X
	 * 
	 * @param x is the input value to find tangent
	 * 
	 * @return the tangent value
	 */
	static double tanXOperations(double x) {
		if (x == 0 || x == 180)
			return 0.0;
		else if (x == 45)
			return 1.0;
		else if (x < 22.5) {
			x = x * (pi / 180);
			double cube = x * x * x;
			double square = x * x;
			return x + ((cube) / 3) + ((2 * (square * cube)) / 15) + ((17 * (cube * cube * x)) / 315);
		} else if (x >= 22.5 && x < 45)
			return (2 * (tanXOperations(x / 2))) / (1 - (tanXOperations(x / 2) * tanXOperations(x / 2)));
		else if (x >= 45 && x < 90)
			return 1 / tanXOperations(90 - x);
		else
			return -tanXOperations(180 - x);
	}
	
	/**
	 * This function reduces the angle that is equivalent 
	 * to the angle in the range 0 and 360
	 * 
	 * @param x is the input degree value
	 * 
	 * @return the reduced angle value
	 */
	public static double reducesAnguleTaxX(double x) {
		x = x % 360;
		x = x > 180 ? x - 180 : x;
		x = x < 0 ? 180 + x : x;
		return x;
	}
	
	/**
	 * getTaxX will return the formatted tangent value
	 * @param x is the input to find the tangent value
	 * @return either the value of the tangent is returned or an exception is throwed to UI
	 */
	public static String getTanX(double x) {
		if(x%90==0 && (x/90)%2!=0) {
			return "Error :Value must not be the odd multiple of pi/2";
		} else {
			x = reducesAnguleTaxX(x);
			return String.valueOf(String.format("%.5f", tanXOperations(x)));
		}
	}

	public static void main(String[] args) {
		double input = 275;
		double temp = input;
		System.out.println(reducesAnguleTaxX(input));
		System.out.println(Math.tan(Math.toRadians(temp)));
	}
	
}
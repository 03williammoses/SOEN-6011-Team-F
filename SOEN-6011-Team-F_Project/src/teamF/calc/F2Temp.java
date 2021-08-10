package teamF.calc;

public class F2Temp {

	final static double PI = 3.14159265358979;
	final static double EPS = 1E-2;
	final static double EPSValueForMinimumCheck = 1E-5;

	public String calculate(double parseDouble) {
		return getTan(parseDouble);
	}

	public static void main(String ar[]) {
		System.out.println(getTan(5));
		double b = Math.toRadians(5);
		System.out.println(Math.tan(b));
	}

	public static double checkIfInsignificant(double tempX) {
		return tempX < 0 ? tempX * (-1) : tempX;
	}

	public static double getCos(double x) {
		double retVal = 1;
		double tmpResult = 1;
		int i = 1;
		while (true) {
			double value = -1 * x * x / (i * i + 1);
			tmpResult = tmpResult * value;
			if (checkIfInsignificant(value) <= 1E-2) {
				break;
			}
			retVal = retVal + tmpResult;
			i = i + 2;
		}
		return retVal;
	}

	public static double getSin(double x) {
		double tmpResult = x;
		double retVal = x;
		int i = 0;
		while (true) {
			double value = (-1 * x * x / ((2 * i + 2) * (2 * i + 3)));
			tmpResult = tmpResult * value;
			if (checkIfInsignificant(value) <= 1E-2) {
				break;
			}
			retVal = retVal + tmpResult;
			i++;
		}
		return retVal;
	}

	public static String getTan(double x) {
		
		x = x*3.14159/180;
		
		double valueOfSinX = getSin(x);
		double valueOfCosX = getCos(x);
		
		if (valueOfSinX < 1E-5) {
			return String.valueOf(0);
		}
		
		if (valueOfCosX < 1E-5) {
			return "undefined";
		}
		
		System.out.println("SinX " + valueOfSinX + " " + Math.sin(x));
		
		System.out.println("CosX " + valueOfCosX + " " + Math.cos(x));
		
		return String.valueOf(valueOfSinX / valueOfCosX);
		
	}

}
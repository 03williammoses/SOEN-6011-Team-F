package teamF.calc;

/**
 * Implementation for function 3
 */
public class F3 {
	
	/**
     * This method calculates e raised to b.
     * @param a value of exponent
     * @return e raised to a
     */
    public static double calculateExponential(double a) {
        //return e raised to a
        double p = 1;
        for (int i = 100; i > 0; --i) {
            p = 1 + a * p / i;
        }
        return p;
    }



    /**
     * This method calculates sinh(x) using exponential. e.g. sinh(x) = ( e(X) - e(-X) ) / 2
     * @param x input value
     * @return sinhx value of X
     */
    public static double calculateSinhx(double x) {
        double value = calculateExponential(x);
        double base = calculateExponential(-x);
        return (value-base)/2;
    }

    
    public static String getSinhx(String value) {
		try {
			double x = Double.parseDouble(value);
			System.out.println(x);
			if(Double.isNaN(x) || Double.isInfinite(x)) {
				 throw new ArithmeticException("Value is NaN or not finite");
			 } else{
				return String.valueOf(String.format("%.5f", calculateSinhx(x)));
			 }
		} catch(NumberFormatException e) {
			throw new NumberFormatException("Input should be a real number");
		}
	}

}

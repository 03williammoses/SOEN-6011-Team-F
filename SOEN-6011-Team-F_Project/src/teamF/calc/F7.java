package teamF.calc;
public class F7 {
    public static double myPow(double x, long y) {


        boolean isNegative = false;

        if (x < 0 && y % 2 != 0) {
            isNegative = true;
        }

        if (x == 0 && y == 0) {
            return 0;
        }

        if (x == 0 && y < 0) {

            throw new IllegalArgumentException("x = 0 and y is negative number will cause divide by zero exception");


        }

        if (x == 0 && y > 0) {
            return 0;
        }

        if (y == 0) {
            return 1;
        }

        if(y < 0){
            y = -y;
            x = 1 / x;
        }

        double result = 1;

        while(y != 0){
            if (result == 0 && !isNegative) {
                return Double.POSITIVE_INFINITY;
            }

            if (result == 0 && isNegative) {
                return Double.NEGATIVE_INFINITY;
            }

            if((y & 1) != 0) {
                result *= x;
            }

            x *= x;
            y >>>= 1;

        }

        return result;
    }

}

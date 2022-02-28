package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                result += i;
            }
        }

        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        for (int i = start; i < stop; i++){
            if (i % 2 != 0){
                result += i;
            }
        }

        return result;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        return NumberUtilities.getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int stop) {
        return NumberUtilities.getExponentiations(0, stop, 1, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getExponentiations(start, stop, 1, 1);
    }


    public static String getRange(int start, int stop, int step) {

        return NumberUtilities.getExponentiations(start, stop, step, 1);
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String result = "";
        for (int i = start; i < stop; i += step){
            result += (int) Math.pow(i, exponent);
        }
        return result;
    }
}

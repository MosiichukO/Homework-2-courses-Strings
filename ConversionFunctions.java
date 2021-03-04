package Strings;

public class ConversionFunctions {

    public static String integerToString(int x) {
        System.out.println(Integer.toString(x));
        return Integer.toString(x);
    }

    public static String doubleToString(double x) {
        System.out.println(Double.toString(x));
        return Double.toString(x);
    }

    public static int stringToInteger(String x) {
        try {
            System.out.println(Integer.parseInt(x));
        } catch (NumberFormatException exception) {
            System.err.println("Incorrect format");
        }
        return Integer.parseInt(x);
    }

    public static double stringToDouble(String x) {
        try {
            System.out.println(Double.parseDouble(x));
        } catch (NumberFormatException exception) {
            System.err.println("Incorrect format");
        }
        return Double.parseDouble(x);
    }
}

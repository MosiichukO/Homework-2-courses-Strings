package Strings;

public class ConversionFunctions {

    public static void integerToString(int x) {
        System.out.println(Integer.toString(x));
    }

    public static void doubleToString(double x) {
        System.out.println(Double.toString(x));
    }

    public static void stringToInteger(String x) {
        try {
            System.out.println(Integer.parseInt(x));
        } catch (NumberFormatException exception) {
            System.err.println("Incorrect format");
        }
    }

    public static void stringToDouble(String x) {
        try {
            System.out.println(Double.parseDouble(x));
        } catch (NumberFormatException exception) {
            System.err.println("Incorrect format");
        }
    }
}

package Strings;

public class OneLine {
    public static void main(String[] args) {
        englishAlphabetUppercase();
    }

    public static void englishAlphabetUppercase () {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void englishAlphabetLowercase () {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void russianAlphabetLowercase () {
        for (char i = 'а'; i <= 'я'; i++) {
            System.out.print(i + " ");
        }
    }

    public static void numbersZeroNine () {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i + " ");
        }
    }

    public static void symbolsASCII () {
        for (char i = 32; i <= 126; i++) {
            System.out.print (i + " ");
        }
    }
}

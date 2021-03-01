package Strings;


import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFunctions {
    public static void main(String[] args) {

        System.out.println(deletePart("Саша,гулять, пошел", 3, 2));
    }

    public static void lengthOfSmallestWord(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        System.out.println(min);
    }

    public static void changeLastSymbols(String str, int quantity) {
        String[] words = str.split(", ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                String result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
                System.out.println(result);
            }
        }
    }

    public static String addSpace(String str) {
        int n = str.length();
        for (int i = 0; i < n - 1; i++) {
            char chr = str.charAt(i);
            if (((chr < '0' && chr >= '!') || (chr < 'A' && chr > '9')) && (str.charAt(i + 1) != ' ')) {
                str = str.replace(Character.toString(chr), (chr + " "));
            }
        }
        return str;
    }

    public static String uniqueSymbol(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public int amountOfWords(String str) {
        String[] words = str.split(" ");
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            amount++;
        }
        return amount;
    }

    public static String deletePart(String str, int startIndex, int length) {
        return str.replace(str.substring(startIndex, (startIndex + length)), "");
    }
}

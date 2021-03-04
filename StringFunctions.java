package Strings;


public class StringFunctions {
    public static int lengthOfSmallestWord(String s) {
        String[] words = s.split(" ");
        int min = words[0].length();
        for (int i = 1; i < words.length; i++) {
            min = Math.min(words[i].length(), min);
        }
        System.out.println(min);
        return min;
    }

    public static String changeLastSymbols(String str, int quantity) {
        String[] words = str.split(", ");
        StringBuilder forCompare = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == quantity) {
                String result = words[i].substring(0, words[i].length() - 3);
                result = result + "$$$";
                System.out.print(result + ", ");
                forCompare.append(result + ", ");
            } else if (i == words.length - 1) {
                System.out.print(words[i]);
                forCompare.append(words[i]);
            } else {
                System.out.print(words[i] + ", ");
                forCompare.append(words[i] + ", ");
            }
        }
        return forCompare.toString();
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

    public static int amountOfWords(String str) {
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

    public static String reverse(String str) {
        StringBuilder strB = new StringBuilder(str);
        return strB.reverse().toString();
    }

    public static String deleteLastWord(String str) {
        int a = str.length();
        for (int i = str.length() - 2; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                a = i;
                break;
            }
        }
        return str.substring(0, a);
    }
}

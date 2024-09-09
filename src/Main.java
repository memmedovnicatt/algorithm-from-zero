import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static String positiveOrNegative(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        }
        return "Neither positive nor negative";
    }

    public static int whichNumberIsBigger(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else if (num3 > num1 && num3 > num2) {
            return num3;
        }
        return 0;
    }

    public static int[] fillArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void sumOfArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println(sum);
    }

    public static boolean isDivisibleByTwo(int[] array) {
        for (int value : array) {
            if (value % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static String isArraySorted(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                count++;
            }
            if (array[i] > array[i + 1]) {
                count--;
            }
        }
        if (count == array.length - 1) {
            return "increasing";
        } else if (count == (array.length - 1) * (-1)) {
            return "decreasing";
        }
        return "mixed";
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int sumUntilN(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUntilN(n - 1);
    }

    static boolean isPalindrome(int n) {
        int sum = 0;
        int temp = n;
        while (n > 0) {
            sum = sum * 10 + n % 10;
            n /= 10;
        }
        return sum == temp;
    }

    static void evenNumbersUpTo(int number) {
        for (int i = 1; i < number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void primeNumbersUpTo(int number) {
        for (int i = 0; i < number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    static void sumAndDigitCount(int number) {
        int sum = 0;
        int count = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
            count++;
        }
        System.out.println("Digit sum: " + sum + ", digit count: " + count);
    }

    static void swapNumbers(int a, int b) {
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    static boolean isPalindromeString(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static void powerFromAToB(int a, int b, int power) {
        for (int i = a; i <= b; i++) {
            System.out.println(pow(i, power));
        }
    }

    static char charAtIndex(int index, String text) {
        return text.charAt(index);
    }

    static boolean areTwoStringsEqual(String a, String b) {
        return a.equals(b);
    }

    static String appendCharToString(String s, char c, int count) {
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i < count; i++) {
            builder.append(c);
        }
        return builder.toString();
    }

    static boolean bothStringsContain(String a, String b, String c) {
        return a.contains(c) && b.contains(c);
    }

    static String substringFromString(String text, int begin, int end) {
        return text.substring(begin, end);
    }

    static String longerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else if (str1.length() < str2.length()) {
            return str2;
        }
        return "They are equal in length";
    }

    static void changeCase(String text) {
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLowerCase(c)) {
                System.out.print(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            } else {
                System.out.print(c);
            }
        }
    }

    static void cleanText(String text) {
        String cleaned = text.trim().replaceAll("\\s+", " ");
        System.out.println(cleaned);
    }

    static boolean areFourNumbersEqual(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    static void findMissingNumberInArray(int[] array) {
        int sum = ((array.length + 1) * (array.length + 2)) / 2;
        for (int value : array) {
            sum -= value;
        }
        System.out.println(sum);
    }

    static void findMissingNumbersInArray(Integer[] array, int maxNumber) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        for (int i = 1; i <= maxNumber; i++) {
            if (!set.contains(i)) {
                System.out.println(i);
            }
        }
    }

    static String removeCharacterFromString(String character, String text) {
        return text.replaceAll(character, "");
    }

    static void fibonacciSeries(int n) {
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(Arrays.toString(array));
    }

    static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static void countWords(String text) {
        String[] words = text.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
    }

    public static void main(String[] args) {

    }
}

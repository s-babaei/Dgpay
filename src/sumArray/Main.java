package sumArray;

import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//      125      562
//      521  +   265  =    786   ----> 687

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String input2 = scanner.next();
        System.out.println(sumReverseArray(input, input2));


    }

    public static Integer sumReverseArray(String first, String second) {
        return Integer.parseInt(reverseString(String.valueOf(Integer.parseInt(reverseString(first))+Integer.parseInt(reverseString(second)))));
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        char swap;
        for (int i = 0; i < chars.length/2; i++) {
            swap = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = swap;
        }
        String outPut = new String(chars);
        return outPut;
    }
}

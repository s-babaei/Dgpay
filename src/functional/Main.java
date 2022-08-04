package functional;

import java.util.Scanner;
import java.util.function.Function;

public class Main {


        public static Boolean printIsHappy (Integer input){
            Function<Integer, Integer> isHappy = integer -> {
                Double sum = 0d;
                do {
                    String string = integer.toString();
                    String[] split = string.split("");
                    sum = 0d;
                    for (int i = 0; i < split.length; i++) {
                        sum = sum + Math.pow(Integer.parseInt(split[i]), 2);
                    }
                    System.out.println(sum);
                    integer = sum.intValue();
                } while (sum > 9);
                return sum.intValue();
            };
            if (isHappy.apply(input) == 1) {
                return true;
            } else {
                return false;
            }

        }

        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);
            Integer input = scanner.nextInt();
            System.out.println(printIsHappy(input));

        }


}
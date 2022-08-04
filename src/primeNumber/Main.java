package primeNumber;

import java.util.Scanner;

// counting prime numbers from 1 to specific number

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        Integer count = 0;
        for (int i = 2; i < number; i++) {
            if (checkPrimeNumber(i))
                count++;
        }
        System.out.println(count);

    }

// check number is prime method
    public static Boolean checkPrimeNumber(Integer number) {
        Boolean check = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                check = false;
        }
        return check;
    }

}

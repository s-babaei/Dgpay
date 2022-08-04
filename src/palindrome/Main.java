package palindrome;

import java.util.Scanner;

// check the string is palindrome
// palindrome --->  aba is palindrome   abab is not palindrome
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palindrome = scanner.next();
        String reverse = "";
        for (int i = palindrome.length() - 1; i >= 0; i--) {
            reverse = reverse.concat(String.valueOf(palindrome.charAt(i)));
        }

        if (palindrome.equals(reverse))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

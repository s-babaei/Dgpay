package castTo0And1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    /*
     *           2    5    6
     *
     *           1    1    1
     *           1    1    1
     *           0    1    1
     *           0    1    1
     *           0    1    1
     *           0    0    1
     *
     *           2     1     1   null   null  null  null
     *           5     1     1     1     1     1    null
     *           6     1     1     1     1     1     1
     *
     *
     *  111 - 111 - 011 - 011 - 011 -001
     *
     *
     * */
// array[i][j]=i+j;

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Integer max = 0;
        int [] [] ints = new int[input.length()][];
        for (int i = 0; i < input.length(); i++) {
            int size = Integer.parseInt(String.valueOf(input.charAt(i)));
            ints[i]=new int[size];
            if(size>max)
                max=size;
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j]=1;
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.printf("%d   " , ints[i][j]);
            }
            System.out.println();
        }


        String[][] strings=new String[input.length()][max];
        for (int i = 0; i <input.length() ; i++) {
            for (int j = 0; j <max ; j++) {
                strings[i][j]="";
            }

        }

        for (int i = 0; i < ints.length ; i++) {
            for (int j = 0; j <ints[i].length ; j++) {
                strings[i][j]=ints[i][j]+"";
            }

        }
//        for (int i = 0; i <input.length() ; i++) {
//            for (int j = 0; j <max ; j++) {
//                System.out.printf("%s   ",strings[i][j]);
//            }
//            System.out.println();
//        }

        String append = "";
        for (int j = 0; j < max; j++) {
        for (int i = 0; i < strings.length; i++) {

                append=append.concat(strings[i][j]);
            }
            System.out.println(append);
            append="";
        }


    }
}
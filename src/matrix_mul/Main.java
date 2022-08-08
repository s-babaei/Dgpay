package matrix_mul;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("row of matrix one : ");
        Integer rowOfMatrixOne = scanner.nextInt();
        System.out.println("column of matrix one : ");
        Integer columnOfMatrixOne = scanner.nextInt();

        System.out.println("row of matrix two : ");
        Integer rowOfMatrixTwo = scanner.nextInt();
        System.out.println("column of matrix two : ");
        Integer columnOfMatrixTwo = scanner.nextInt();

        if (columnOfMatrixOne.equals(rowOfMatrixTwo)) {
            Integer[][] matrixOne = new Integer[rowOfMatrixOne][columnOfMatrixOne];
            Integer[][] matrixTwo = new Integer[rowOfMatrixTwo][columnOfMatrixTwo];
            Integer[][] result = new Integer[rowOfMatrixOne][columnOfMatrixTwo];

            System.out.println("matrix1 : ");
            for (int i = 0; i < rowOfMatrixOne; i++) {
                for (int j = 0; j < columnOfMatrixOne; j++) {
                    matrixOne[i][j] = scanner.nextInt();
                }
            }
            System.out.println("matrix2 : ");
            for (int i = 0; i < rowOfMatrixTwo; i++) {
                for (int j = 0; j < columnOfMatrixTwo; j++) {
                    matrixTwo[i][j] = scanner.nextInt();
                }
            }


            Integer sum = new Integer(0);
            for (int i = 0; i < rowOfMatrixOne; i++) {
                for (int j = 0; j < columnOfMatrixTwo; j++) {
                    for (int k = 0; k < rowOfMatrixTwo; k++) {
                        ThreadImplMul threadImplMul = new ThreadImplMul(matrixOne[i][k] , matrixTwo[k][j]);
                        threadImplMul.start();
                        try {
                            threadImplMul.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        ThreadImplSum threadImplSum = new ThreadImplSum(threadImplMul.getMultiplication(),sum);
                        threadImplSum.start();


                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        sum=threadImplSum.getSum();

                    }
                    result[i][j] = sum;
                    sum = 0;
                }
            }

            Runnable runnable=new Runnable() {
                @Override
                public void run() {
                    int sum=0;

                }
            };





            for (int i = 0; i < rowOfMatrixOne; i++) {
                for (int j = 0; j < columnOfMatrixTwo; j++) {
                    System.out.println(result[i][j]);
                }
            }
        } else {
            System.out.println("oops!!!");
        }


//        int i1 = ( matrix[0][0]*matrix2[0][0])
//                +( matrix[0][1]*matrix2[1][0] )
//                +(matrix[0][2]*matrix2[2][0] );

//        int[][] result = new int[3][3];
//        int sum = 0;
//        int k = 0;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//
//                sum = sum + matrix[i][j] * matrix2[j][i];
//
//            }
//
//            result[i][k] = sum;
//            System.out.println(sum);
//            sum=0;
//
//        }
//        int[][] matrix = new int[2][2];
//        matrix[0][0] = 1;
//        matrix[0][1] = 1;
//        matrix[1][0] = 2;
//        matrix[1][1] = 2;
//
//        int[][] matrix2 = new int[2][2];
//        matrix2[0][0] = 1;
//        matrix2[0][1] = 1;
//        matrix2[1][0] = 2;
//        matrix2[1][1] = 2;
//
//        int sum = 0;
//        for (int i = 0; i <2; i++) {
//            for (int j = 0; j <2; j++) {
//                sum=0;
//                for (int k = 0; k <2; k++) {
//                    sum = sum + matrix[i][k]*matrix2[k][j];
//                }
//                System.out.println(sum);
//                sum=0;
//            }
//        }


//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                for (int k = 0; k < 2; k++) {
//                    for (int l = 0; l < 2; l++) {
//                        System.out.println(i + j + k + l);
//                    }
//                }
//            }
//        }


        //   System.out.println(i1);

//        int x = 1;
//        for (int i = 0; i < 3; i++) {
//
//            for (int j = 0; j < 3; j++) {
//                matrix[i][j]=x;
//                continue;
//                x=x+1;
//
//            }
//
//        }


//        System.out.printf("%d   ", matrix[0][0]);
//        System.out.printf("%d   ", matrix[0][1]);
//        System.out.printf("%d   ", matrix[0][2]);
//        System.out.println();
//        System.out.printf("%d   ", matrix[1][0]);
//        System.out.printf("%d   ", matrix[1][1]);
//        System.out.printf("%d   ", matrix[1][2]);
//        System.out.println();
//        System.out.printf("%d   ", matrix[2][0]);
//        System.out.printf("%d   ", matrix[2][1]);
//        System.out.printf("%d   ", matrix[2][2]);
//
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println(matrix[i][j]);
//
//            }
//
//        }


//        for (int i = 0; i < 10; i++) {
//            if (i==5)
//                continue;
//            if (i==7)
//                break;
//            System.out.println(i);
//        }


        // int sum = 0+1+2+3+4+5+6+7+8+9=45;

        // sum=sum + 0
        // sum=sum + 1
        // sum=sum + 2
        // sum=sum + 3
        // sum=sum + 4
        // sum=sum + 5
        // sum=sum + 6
        // sum=sum + 7
        // sum=sum + 8
        // sum=sum + 9

        // i++

        //


//        int sum = 0;
//        int zarb=1;
//
//        for (int i =5; i>0   ; i--) {
//            //sum=sum+i;
//            zarb=zarb*i;
//        }
//        System.out.println(zarb);


    }
}

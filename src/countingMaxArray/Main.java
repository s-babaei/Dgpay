package countingMaxArray;

public class Main {
    //calculating max array and at the end insert zero to end of bound array
    public static void main(String[] args) {

        int [] input = new int[]{16,17,6,2,5,3};
        int[] replace = replace(input);
        for (int i = 0; i < replace.length; i++) {
            System.out.println(replace[i]);
        }

    }


    public static int [] replace(int [] input){
        int [] inputReplaced = new int[input.length];
        int counter1 = 0,counter2=0,maximum=0;
        while (counter1<input.length-1){
            maximum=input[counter1+1];
            counter2=counter1+1;
            while (counter2<input.length){
                maximum=Math.max(maximum,input[counter2]);
                counter2++;
            }
            inputReplaced[counter1]=maximum;
            counter1++;
        }
        inputReplaced[input.length-1]=-1;
        return inputReplaced;
    }
}

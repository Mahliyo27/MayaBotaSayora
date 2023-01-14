package revers;

public class ReversInt_2_way {

    public static void main(String[] args) {


        int num = 1234;

         int reversed = 0;


        while(num != 0) { // if num not equal to Zero

            int digit = num % 10;


            reversed = reversed * 10 + digit;

            num /= 10; }
        System.out.println("Reversed Number: " + reversed);






    }


}

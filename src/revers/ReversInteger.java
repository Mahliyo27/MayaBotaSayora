package revers;

public class ReversInteger {
    public static void main(String[] args) {



        int num =1234;


        String revInt = "";
        String strNum = String.valueOf(num); // covert int to String

        for (int i = strNum.length()-1; i >= 0; i--) {

            revInt +=  strNum.charAt(i);

        }


        System.out.println(revInt);




    }
}

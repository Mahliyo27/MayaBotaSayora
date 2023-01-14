package primeNumber;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println(isPrime(4));







    }






        // 2,3,5,7,11,13,17 ==>Is Prime Number
        // 1, 0,4,6,8,10,12, ==> is NOT Prime NUmber


        // The  2 is only  even prime number because all the other even number can not be divided by 2.



    public static   boolean isPrime(int number){




        if (number <=0){ // if number less the or equal to 0 can not be prime number
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number %i==0){
                return false;
            }
        }
        return true;




    }




}

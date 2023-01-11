package revers;

public class ReverArray {


    public static void main(String[] args) {


        String name ="Sayora";

        char[] ch = name.toCharArray(); // convert String to char array

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }



    }

}

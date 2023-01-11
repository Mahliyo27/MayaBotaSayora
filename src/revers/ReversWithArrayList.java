package revers;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversWithArrayList {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>(); // revers Colections list


        list.addAll(Arrays.asList("Maya","Akbota","Sayora"));

        String result ="";

        for (int i = list.size() - 1; i >= 0; i--) {
           result+=list.get(i);
        }

        System.out.println(result);


    }


}

package revers;

public class ReversArrayWithArray {
    public static void main(String[] args) {



        String[] classmates = {"Mahliyo"};
        for (int i = 0; i < classmates.length; i++) {//all elements of the array
            String name = classmates[i];//each element will be assigned to string variable name
            String reverse1 = "";//new variable where we are going to store new reversed name after rever sing


            for (int j = name.length() - 1; j >= 0; j--) {//last index of name~0
                reverse1 += name.charAt(j);  //j is new variable for name letters
                //j is for characters of the name

            }
            System.out.println(reverse1);


        }


        // Revers Array


    }
}

package revers;

public class reversString {
    public static void main(String[] args) {

        String name = "Mahliyo";
        String revers = "";

        for (int i = name.length()-1; i >=0 ; i--) {
            revers+=name.charAt(i);
        }

        System.out.println(revers);


        // revers string with String
    }
}

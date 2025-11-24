import java.util.Scanner;

public class CompareStrings {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String one = "Carmen";
        System.out.println("Enter your name >> " );
        String two =  input.nextLine();

        if (one.equals(two)) {
            System.out.println(one + " equals " + two);
        } else {
            System.out.println(one + " does not equal " + two);
        }
    }

}

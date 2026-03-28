import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        int a = age.nextInt();
        if (a >= 18) {
            System.out.println("you are eligible to vote");
        } else if (a < 18) {
            System.out.println("you are not eligible to vote");
        } else {
            System.out.println("invalid input");
        }

    }
}

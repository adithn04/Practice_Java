import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a > 0) {
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        num.close();
    }
}

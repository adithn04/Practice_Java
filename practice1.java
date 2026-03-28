import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        String s = sc.nextLine();

        System.out.println("Name is: " + s);
        System.out.println("Roll number is: " + n);
    }
}
import java.util.*;

public class taskop {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = num.nextInt();

        for (int i = 1; i <= 10; i++) {
            int ans = a * i;
            System.out.println(i + " * " + a + " = " + ans);
        }
        num.close();
    }
}

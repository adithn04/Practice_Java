import java.util.*;

public class Arlist {
    public static int test() {
        int count = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();
        System.out.println("Enter the elements of the array:");

        int[] arr = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the threshold value:");
        int k = input.nextInt();
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] >= k) {
                count++;
            }
        }
        input.close();
        System.out.println("Count is:");
        return count;

    }

    public static void main(String[] args) {

        System.out.println(Arlist.test());
    }
}

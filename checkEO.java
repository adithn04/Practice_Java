public class checkEO {
    public static int m1(int a) {
        if (a % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        if (m1(a) == 1) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

}

public class larnum {
    public static int lar(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (a < arr[i]) {
                a = arr[i];
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 13, 4, 10 };
        int b = lar(ar);
        System.out.println(b);
    }
}

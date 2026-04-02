public class sumofarr {
    public static int add(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 4, 5 };
        int b = add(ar);
        System.out.println(b);
    }
}

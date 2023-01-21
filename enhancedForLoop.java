public class enhancedForLoop {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int val : a) {
            sum += val;
        }
        System.out.println(sum);
    }
}

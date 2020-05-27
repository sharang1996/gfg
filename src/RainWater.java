public class RainWater {

    public static void main(String[] args) {

        int[] a = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] leftMax = new int[a.length];
        int[] rightMax = new int[a.length];

        leftMax[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], a[i]);
        }
        rightMax[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--)
            rightMax[i] = Math.max(rightMax[i + 1], a[i]);

        /*System.out.println(java.util.Arrays.toString(a));
        System.out.println(java.util.Arrays.toString(leftMax));
        System.out.println(java.util.Arrays.toString(rightMax));*/

        int capacity = 0;

        for (int i = 0; i < a.length; i++) {
            capacity += Math.min(leftMax[i], rightMax[i]) - a[i];
        }
        System.out.println(capacity);
    }
}

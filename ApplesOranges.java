public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        int orangesCount = 0;
        for (int i = 0; i < apples.length; i++) {
            int totalApples = a + apples[i];
            if (totalApples >= s && totalApples <= t) {
                ++applesCount;
            }
        }
        for (int i = 0; i < oranges.length; i++) {
            int totalOranges = b + oranges[i];
            if (totalOranges >= s && totalOranges <= t) {
                ++orangesCount;
            }
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
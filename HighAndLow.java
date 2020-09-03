public class HighAndLow {

    public static int[] breakingRecords(int[] scores) {
        int[] highAndLow = { 0, 0 };
        int currentLowScore = scores[0];
        int currentHighScore = scores[0];

        /*
         * loop through the scores update low and high scores if largest or smallest
         * update counting array if score is broken
         */

        for (int score : scores) {
            if (score > currentHighScore) {
                currentHighScore = score;
                highAndLow[0]++;
            } else if (score < currentLowScore) {
                currentLowScore = score;
                highAndLow[1]++;
            }
        }
        return highAndLow;
    }
}
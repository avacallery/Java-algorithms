// Given the price of [arrays] keyboards and USB drives, and int b = budget, find and print the amount of money Monica will spend.
// If she doesn't have enough money, return -1
// Monica can only buy one (1) keyboard and one (1) USB drive
//

class Solution {
    static int getMoneySpent(int[] keyboards, int[] drives, int budget) {
        int maxSpending = -1;
        int totalCost;


        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                totalCost = keyboards[i] + drives[j];
                if (totalCost <= budget && totalCost > maxSpending) {
                    maxSpending = totalCost;
                }
            }
        }

        return maxSpending;
    }
}
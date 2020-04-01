package javaExercises.coinsProblem;

public class Coins {
    public static int calcMinimumCoins(int[] coins, int amount) {
        int length = coins.length;

        int[] resultArray = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {

            int minimumCoins = Integer.MAX_VALUE / 2;

            for (int j = 0; j < length; j++) {
                if (coins[j] <= i) {
                    if (resultArray[i - coins[j]] < minimumCoins) {
                        minimumCoins = resultArray[i - coins[j]];
                    }
                }
            }
            resultArray[i] = minimumCoins + 1;
        }
        return resultArray[amount] < Integer.MAX_VALUE / 2 ? resultArray[amount] : -1;
    }

    public static void main(String[] args) {

        int[] coins = {1, 3, 10, 25, 50};

        int amount = 33;

        System.out.println("Minimum number of coins required: " + calcMinimumCoins(coins, amount));
    }
}

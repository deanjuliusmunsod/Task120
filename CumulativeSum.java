

public class CumulativeSum {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        int totalCumulativeSum = cumulativeSum(numbers);

        System.out.println("Total sum of cumulative sums is: " + totalCumulativeSum);
    }

    public static int cumulativeSum(int[] args) {
        int totalSum = 0;

        for (int num : args) {
            // Calculate the cumulative sum for the current number
            int cumulative = (num * (num + 1)) / 2; // Using the formula for sum of first n natural numbers
            totalSum += cumulative; // Add to total sum of cumulative sums

            // Print the cumulative sum for the current number
            System.out.println("Cumulative sum for " + num + " is: " + cumulative);
        }

        return totalSum;
    }
}


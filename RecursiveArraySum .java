public class RecursiveArraySum {

    // Recursive method to calculate sum of array elements
    public static int recursiveSum(int[] arr, int index) {
        // Base case: if index is less than 0, return 0
        if (index < 0) {
            return 0;
        }
        // Recursive case: return current element + sum of remaining elements
        return arr[index] + recursiveSum(arr, index - 1);
    }

    public static void main(String[] args) {
        // Sample array
        int[] numbers = {5, 10, 15, 20, 25};

        // Call recursive sum function
        int sum = recursiveSum(numbers, numbers.length - 1);

        // Output the result
        System.out.println("Sum of array elements: " + sum);
    }
}

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 2, 3};
        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int element : arr) {
            stack.push(element);
        }

        // Pop elements from the stack and place them back into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
}
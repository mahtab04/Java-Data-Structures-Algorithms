public class NextGreaterElement {

    public static int[] nextGreaterElement(int arr[]) {
        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = -1;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        result[arr.length - 1] = -1;
        return result;
    }

    public static int [] nextGreaterElement2(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    
    public static void main(String[] args) {
        int arr[] = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };
        int result[] = nextGreaterElement(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    
    }
}

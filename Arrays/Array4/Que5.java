package Arrays.Array4;

public class Que5 {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

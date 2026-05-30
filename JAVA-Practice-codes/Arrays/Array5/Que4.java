// Q4. WAP to check the first duplicate element in an array and return its index.
// Example :
// Input:
// Enter the size of the array:
// 6
// Enter the elements of the array:
// 1
// 2
// 3
// 3
// 2
// 5
// Output:
// First duplicate element present at index 1

package Arrays.Array5;

public class Que4 {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 3, 2, 5};
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("index: " + i);
                    System.out.println("Element: " + arr[i]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }
    }
}


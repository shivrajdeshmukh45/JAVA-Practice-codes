package Arrays.Array5;

class Que8 {
    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 31, 4, 0};

        // Initialize minEle and secMin with the maximum integer value
        int minEle = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        // Find the smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minEle) {
                minEle = arr[i];
            }
        }
        System.out.println(minEle);

        // Find the second smallest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minEle && arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        System.out.println("The second minimum element in the array is: " + secMin);

      
    }
}

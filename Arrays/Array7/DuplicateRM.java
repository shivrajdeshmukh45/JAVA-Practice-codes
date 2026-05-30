package Arrays.Array7;  



class DuplicateRM {
    public static void main(String[] args) {
        int arr[] = {1,2,4,7,3,2,4,5,7,1};
        
        // Step 1: Sort first (required for consecutive logic)
        // You can use Arrays.sort(arr); but manual bubble for interview
        for(int i = 0; i < arr.length-1; i++) {
            for(int k = 0; k < arr.length-1-i; k++) {
                if(arr[k] > arr[k+1]) {
                    int temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }
        }
        // arr now: [1,1,2,2,3,4,4,5,7,7]
        
        int j = 0;
        for(int i = 0; i < arr.length-1; i++) {  // Fixed: i < length-1
            if(arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];  // Last unique
        
        // Print unique elements
        for(int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");  // 1 2 3 4 5 7 
        }
    }
}

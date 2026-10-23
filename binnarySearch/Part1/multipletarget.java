public class multipletarget {
    

    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 11, 12, 23, 45, 89};

        int[] targets = {45, 4, 12, 100};

        for (int target : targets) {
            int ans = BinarySearch(arr, target);
            System.out.println("Target: " + target + ", Index: " + ans);
        }
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
/*Output->
Target: 45, Index: 10
Target: 4, Index: 6
Target: 12, Index: 8
Target: 100, Index: -1 */
    

/*
 this is the chatgpt code 
 both the logic is same for the code for finding multiple element 
 or the single element just it added a for loop there,right now I'm unable to 
 understand the logic behind the for loop there but I know what is it
 shortly I will discover soon
*/
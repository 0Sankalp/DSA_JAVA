
public class Inrange {
    public static void main(String[] args) {
        int arr[] = {23, 45,1,28,-3,19,-16, 67, 89, 12, 34};
        int target = 12;
        System.out.println(linearSearch(arr, target,1,10));
    }

    static int  linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

   
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }

        return -1;
    }

   
}
// it will print the index 
// output = 9
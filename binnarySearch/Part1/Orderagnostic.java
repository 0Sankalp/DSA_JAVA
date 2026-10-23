// Order Agnostic Binary search
//It is the situation where we don't know that the array is in which form like ascending or descending 
// method is same to find the element of the array but here we have to find first that wheather the array is asce or desc
// 

public class Orderagnostic {
   public static void main(String[] args) {
  
        int []arr={-18,-12,-4,0,2,3,4,11,12,23,45,89};
        int target = 45;
        int ans = OrderagnosticBinarySearch(arr,target);
        System.out.println(ans);
    }
  


    static int OrderagnosticBinarySearch(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        // find wheather the array is in asec or desc form
        boolean isAsc = arr[start]<arr[end];
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return  mid;
            }
            if (isAsc) {
                if (target<arr[mid]) {
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end= mid-1;
                }else{
                    start =mid+1;
                }
            }
        }
        return -1;
   } 
}

/*Binnary Search
It is the process of finding the element from the array , but the array must be in the shorted way
->like it can be shorted in the ascending order  or can be shorted in the descending order 
->The way to find the element is to find the middle element of the array and comapare it from the target element  
->This process goes until the element is found  else if the element is not there it will return -1
->Time Complexity 
   -Best case: 0(1)
   -Worst case: logN
   Formula to find the middle element : Start+(end-Start)/2

*/
public class Intro {

    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,4,11,12,23,45,89};
        int target = 45;
        int ans = BinarySearch(arr,target);
        System.out.println(ans);
    }
    // return the index 
    // return -1 if elment does not exist in the array

    static int BinarySearch(int[]arr,int target){
        int start =0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(target<arr[mid]){
                end=mid - 1;
            }
            else if (target>arr[mid]) {
                start = mid +1;
              
            }
              else{
                    return mid ;
                }     
        }
        return -1;
    }
}


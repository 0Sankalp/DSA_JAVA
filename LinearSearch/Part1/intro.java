/*
linaer Search
Searching the value in the array one by one 
*/
public class intro{
    public static void main(String[] args) {
        int num[] = {23, 45,1,28,-3,19,-16, 67, 89, 12, 34};
        int target =12;
        int ans = linearSearch(num, target);
        System.out.println(ans);
        
}
//search the array and rerun the index if item found otherwise return -1
static int linearSearch(int arr[], int target){
// for returning the value in element 

    if(arr.length==0){
        return -1;
    }
    //for(int i=0;i<arr.length;i++){
    for(int element: arr){
        //check for element at every index if it is = target    
        //int element = arr[i];
       
        if(element==target){
            return element;
        }
    }
    /*this line will execute if none of the return statements above have executed
     */
    return -1;
}
}

// here it is returning the index value 
// output = 9

// now the value will be return in the elememnt form 
// output = 12
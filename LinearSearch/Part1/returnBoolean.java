class BooleanSearch {
public static void main(String[] args) {
        int num[] = {23, 45,1,28,-3,19,-16, 67, 89, 12, 34};
        int target =12;
        System.out.println(search(num, target));
     
        
}

static boolean search(int arr[], int target){
    if(arr.length==0){
        return false;
    }
    for(int element: arr){
        if(element==target){
            return true;
        }
    }
    return false;
}
}

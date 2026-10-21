
public class Stringarray {
    public static void main(String[]args){
    // Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        arr[0]=23;
        arr[1]=45;
        arr[2]=8;
        arr[3]=89;    
        arr[4]=90;
       // System.out.println(arr [2]);
        //8
        // now if we have to print all the values of array then we can use for loop
      /*   for(int i = 0;i<arr.length;i++){
            arr[i]=in.nextInt();
            System.out.println(arr[i]);
        }

        for (int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");// this is one more option to print the array values
       
        
    }*/
    for (int num:arr){
        System.out.println(num); // for every element in the array it will print the value of that element
    }
}
}
/*8
23
45
8
89
90
now if we have to print all the values of array then we can use for loop
*/

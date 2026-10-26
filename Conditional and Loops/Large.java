import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // find the largest of the 3 numbers

        /*int max = a;
        if(b> max){
            max =  b;
            
        }if(c> max){
            max = c;
        }
        System.out.print( "Largest number " + max);
        */



        /*
    output:    
11
53
89
Largest number 8
*/

        
        int max1 = Math.max(c,Math.max(a, b));
        
        System.out.print(max1);

        /*
        output:
        45
47
547
547

        */
    }
}

// work of both things are same but one is using condtion and one using math 
import java.util.Scanner;

public class Revrse {
    public static void main(String[] args) {
         //int num =25846;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your number: ");// asknig from the user
         int num = sc.nextInt();

         int ans =0;
         
         while (num>0) {
            int rem = num % 10;//(% 10 = Get the last digit.)
            num /= 10;//It divides num by 10 and stores the result back in num  (num /= 10 → removes the last digit.)
            ans = ans *10 + rem;
         }
         System.out.println(ans);

    }
}

/*
output 
Enter your number: 4568
8654
*/

import java.util.Scanner;

public class Evenodd{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
              System.out.println("Enter your number:");
              int num = input.nextInt();
              if (num%2==0) {
                System.out.println("Even Number");
                 }else{
                    System.out.println("Odd Number");
                 }


    }
}

/*
Output:
8
Even Number
999
Odd Number
*/
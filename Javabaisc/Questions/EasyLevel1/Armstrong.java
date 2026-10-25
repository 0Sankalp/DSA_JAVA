import java.util.Scanner;

public  class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int orignal = num;
        int sum = 0;

        int digits = String.valueOf(num).length();// conevrt and count

        while (num>0) {
            int digit = num%10;
            sum = sum+(int)Math.pow(digit, digits);
            num= num/10;

            
        }
        
    if (orignal==sum) {
        System.err.print("Armstrong Number");
        
    }else{
        System.out.print("Not Armstrong");
    }
    }
}
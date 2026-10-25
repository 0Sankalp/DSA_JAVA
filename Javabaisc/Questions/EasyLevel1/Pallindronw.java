import java.util.Scanner;

public class Pallindronw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int  num = sc.nextInt();

        int orignal = num; // it will store the orignal value given by the user
        int reverse = 0;

        while (num>0) {
            int digit = num % 10;// gives the last digit  like 121%10 = 1
            reverse = reverse *10 + digit;//   0 * 10 +1
            num = num/10;// 121/10=12
            
        }
        if(orignal==reverse){
            System.out.println("Number is pallindrone");
        }else{
            System.out.println("Not a pallindrone");
        }
    }
}

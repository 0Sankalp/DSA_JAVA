import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        
        System.out.print("Enter your First number: ");
        int num1 = sc.nextInt();

        System.out.print("Eneter your Second number: ");
        int num2 =sc.nextInt();

        if(num1>num2){
            System.out.print(num1 + " num1 is the largest number");

        }
        else if(num2>num1){
            System.out.println(num2 + " num2 is the largest number");
        }else{
            System.out.println("Both are equal");
        }
}
}

/*
output->
Enter your First number: 10000
Eneter your Second number: 1548464
1548464 num2 is the largest number


Enter your First number: 8
Eneter your Second number: 8
Both are equal
*/
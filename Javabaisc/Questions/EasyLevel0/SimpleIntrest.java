import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your principal amount: ");
        double P =  sc.nextDouble();

        System.out.print("Enter your Rate amount: ");
        double R = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double T = sc.nextDouble();

        double SI = (P*R*T)/100;
        System.out.println("Simple Intrest: " + SI);
    }
    
}

/*
Output->
Enter your principal amount: 12
Enter your Rate amount: 20
Enter the Time: 8
Simple Intrest: 19.2

*/
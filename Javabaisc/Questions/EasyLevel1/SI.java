import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your Principal");
        int P = sc.nextInt();
    
        System.out.print("Enter your rate: ");
        int R = sc.nextInt();
        
        System.out.print("Enter your time");
        int T = sc.nextInt();
        
        
        int SI = (P*R*T)%100;
        System.out.print("Simple Intrest " + SI);
        
    }
         
}

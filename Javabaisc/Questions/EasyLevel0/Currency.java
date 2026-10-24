import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print( "Enter your Currency in Ruppee:");
        double Ruppee = sc.nextDouble();
       

        double USD = Ruppee/90;
        System.out.print("Your currency in USD " + USD);



    }
}
/*
Output->
Enter your Currency in Ruppee:265
Your currency in USD 2.9444444444444446
*/
import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter the temprature in C");//c- celcius
    float tempC = input.nextFloat();
    float  tempF = (tempC *9/5)+32;
    System.out.println(tempF);

    }
}

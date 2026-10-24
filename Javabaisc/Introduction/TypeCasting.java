import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       /*float num = input.nextFloat();
        System.out.println(num);
        //61
        //61.0
        int num1 = input.nextInt();
        System.out.print(num1);
*/
        // Type casting
      //  int num = (int)(56.54f);
        //System.out.print(num);
        //5646 it will return only the integer value, so this called type casting


        // automatic type promotion in expressions
       // int a = 257;
        //byte b = (byte)(a);
        //System.out.println(b); // 257 %256 = 1
        //int number = 'a';
        // it will print ASCII value of it which is 97
        int number = 'A';
        // now it wil print 65
        System.out.print(number);
        System.out.println(38*5.69848);
        byte b =42;
        char c = 'x';
        short s = 5000;
        int i = 50221;
        float f = 5.66f;
        double d = 0.2151;
        double result= (f*b)+ (i/c)-(d-s);
        System.out.println((f*b)+ " " +(i/c)+ " " +(d-s));
        System.out.println(result);
        /*
        output-
        237.72 418 -4999.7849
        5655.504870703125
        */

    }
}
/*
Rules for the automatic prmotion
-> All the byte short and character values are promoted into the integer
->if one the value are given in the float or double or long so it will be coonverted
  from the integer into that value   
    System.out.println(38*5.69848);
    here we have multipluied these value and the output which come is
    65216.54224 so this comes in the float 
*/


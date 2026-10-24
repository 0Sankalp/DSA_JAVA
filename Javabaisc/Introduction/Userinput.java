import java.util.Scanner;

public class Userinput {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
       // System.out.println("Please enter some input");
        //int rollno = input.nextInt();
        //System.out.println("Your roll number is " + rollno);

       int a = 10;
      //  a is the reference variable
      //  a is the identifier and 10 is the literal  
      //String name = input.next();
      /*
input.nextLine();
hey dwarika
hey
this will print the only first word of the line 
input.nextLine();
hey my name is dwarika
hey my name is dwarika
this will print the whole line 
*/
      //System.out.println(name);
     
     
      //float marks = input.nextFloat();
     // System.out.print(marks);
      /*
      45454.54454848
      45454.543
      this will give the value by rounding it off
      so this is the floating point error values are not printed accurate
      */
     double marks1 = input.nextDouble();
     System.out.print(marks1);
     // this is used to avoid the floating point error 
     // it gives the value as accuarete as given by the user
     //754.155648
     //754.155648

    }
    
}


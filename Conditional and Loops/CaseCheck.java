import java.util.Scanner;

// this program is used to check wheather alphabet is in upper case or lower case

public class CaseCheck {
    public static  void main(String[]args){
        Scanner in = new Scanner(System.in);
        
      char ch = in.next().trim().charAt(0);
      if(ch >='a'  && ch<= 'z'){
        System.out.println("Lowercase");
      }else{
        System.out.println("Uppercase");
      }/*
     
Uppercase
      */
  
  
  
      //System.out.println(in.next());

  /*String word = "hello";
  System.out.println(word.charAt(4));
  // it will print 'o' here because at index 4 o is prsent there
*/
    }
}
/*
in.next()-it will print the input you have given
hello
hello
trim()- this will remove the extra space, something like this  
             hey
hey
charAt(0)- it bsicaly print the index element
*/
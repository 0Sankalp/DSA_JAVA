import java.util.Arrays;
import java.util.Scanner;

public class arrayObject {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);

    String[]str = new String[4];
    for(int i=0;i<str.length;i++){
     str[i]=in.next();
    }
    
    System.out.println(Arrays.toString(str));
    in.close();// if ypu are using scanner then it is a good practice to close the scanner after use other wis it will throw error
    }
    
}

/*
Sankalp
Dubey
Dwarika
Dhuish
[Sankalp, Dubey, Dwarika, Dhuish]
 */

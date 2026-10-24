import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextInt()); // 5645 it will pass this 
        // but if you try to give string it will throw error
        //System.out.println(input.next());// It will print only the first word
        System.out.println(input.nextLine());// it wil print the whole line (how are you)
    }
    
}
/*
Scanner-> It basically read  everything whaterver you have given in the input
System.out-> Comamnd line or your computer 
System.in -> Your keyboard
 */
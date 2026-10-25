import java.util.Scanner;

public class StringPallindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your word");
        String word = sc.nextLine();

        String orignal = word;
        String rev = "";
        
        for(int i = word.length()-1;i>=0; i--){
          rev = rev + word.charAt(i);

        }
        if(orignal.equals(rev)){
            System.err.print("Pallindrone");

        }else{
            System.out.print("Not pallindrone");
        }

    }
    
}

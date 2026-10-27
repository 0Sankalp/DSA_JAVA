public class Count {
    public static void main(String[]args){
        int n =455365;

        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 5){// it will count number of 5 prsent in n 
                count++;
            }
             n = n / 10; // n /= 10
        }
        System.out.println(count);

    
    }

}
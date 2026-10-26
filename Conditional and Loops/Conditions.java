public class Conditions{
    public static void main(String[]args){
        int Salary = 25000;
  /*       if(Salary>10000){
           Salary = Salary + 2400;

        }else{
            Salary = Salary + 1200;
        }
        System.out.print(Salary);
        //Output - 27400
*/

// multiple if-else Statement

            if(Salary < 10000){
             Salary += 2000; // Salary = Salary + 2000
            } else if (Salary > 20000) { // comining more than one if condition
                Salary +=3000;
            }else{
                Salary +=1000;
            }
            System.out.print(Salary);
    }
}
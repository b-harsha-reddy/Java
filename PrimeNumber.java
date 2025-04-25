//This program checks prime number
public class PrimeNumber{
    public static void main(String[] args) {
        
        int number = 47;
        int count = 0;

        for (int num = 2;num<=Math.sqrt(number);num++){
            if(number % num ==0){
                count++;
            }
        }
        if(count>0){
            System.out.println("Not Prime");
        
        }
        else {
            System.out.println("Prime");
        }
    }
}
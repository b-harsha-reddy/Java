//Armstrong Number
public class ArmstrongNumber{
    public static void main(String[] args){

        int number = 153;
        number = Math.abs(number);
        int count = 0;
        int temp = number;
        int sum =0;
        
        
        do {
            
            count++;
            temp /= 10;

        } while (temp>0);
        temp = number;
        while(temp >0){

            int num = temp%10;
            sum += Math.pow(num, count);
            temp /= 10;

        }
        if(number==sum){
            System.out.println("Armstrong Number");
        }

    }
}
//This program counts number of digits in a number
public class CountDigits{
    public static void main(String[] args) {
       
       int num = 123456;
       num = Math.abs(num);
       int count = 0;
    // Using do while loops helps in case when the num is zero
       do { 
        count++;
        num /= 10;           
       } while (num > 0);

       System.out.println(count);


    }
}
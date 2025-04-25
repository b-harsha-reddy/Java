public class FizzBuzz{
    public static void main(String[] args){

        

        for(int num=1;num<=100;num++){
            String output;

            if(num % 3 == 0 && num % 5 == 0){
                output ="FizzBuzz";
            }
            else if(num % 3 == 0){
                output="Fizz";
            }
            else if(num % 5 == 0){
                output ="Buzz";
            }
            else {
                output = String.valueOf(num);
            }
            System.out.println(output);

            }
        }

    }
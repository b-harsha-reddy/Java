public class FizzBuzz{
    public static void main(String[] args){

        

        for(int num=1;num<=100;num++){
            StringBuilder output = new StringBuilder();

            if(num % 3==0 && num%5==0){
                output.append("Fizz Buzz");
            }
            else if(num % 3==0){
                output.append("Fizz");
            }
            else if(num % 5==0){
                output.append("Buzz");
            }
            else{
                output.append(num);
            }
            System.out.println(output);
        }

    }
}
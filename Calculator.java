import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {       
       int choice;
       try (Scanner sc = new Scanner(System.in)) {
   
       
 
        do{
         System.out.println("1.Add\n2.Subtraction\n3.Multiply\n4.Divide\n5.Exit");
         System.out.println("Please select a choice");
         choice = sc.nextInt();

    
         if(choice >=1 && choice <5){


            System.out.println("Enter first number");
            double num_1 = sc.nextDouble();
            System.out.println("Enter second number");
            double num_2  = sc.nextDouble();
           

            switch(choice){

                case 1:
                    System.out.println("Sum :"+(num_1+num_2));
                    break;
                case 2:
                    System.out.println("Difference :"+(num_1-num_2));
                    break;
                case 3:
                    System.out.println("Multiplication :"+(num_1*num_2));
                    break;
                case 4:
                    System.out.println("Divison"+(num_1%num_2));
                    break;
            }
            
         }
         else if(choice==5){
            System.out.println("Exit");
            break;
         }
       

        }while(choice!=5);
         // sc.close(); // No need to explicitly close as try-with-resources handles it
        
       }
}
}


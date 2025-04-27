//This program prints Reverse String
public class StringReverse{
    public static void main(String[] args) {
       
       String name = "Hello";
       String rev ="";
       for(int i =name.length()-1;i>=0;i--){
        rev += name.charAt(i);
       }
       System.out.println(rev);
       

    }
}
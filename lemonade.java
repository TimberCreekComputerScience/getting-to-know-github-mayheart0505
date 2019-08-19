import java.util.Scanner;
public class lemonade{
    

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
    
        System.out.println("How many lemonades would you like?");
        int numLem = scan.nextInt();
        
        double price = 1.25;
        double totalPrice = price * numLem;
        if(numLem > 0){
               System.out.printf("You owe $%.2f", totalPrice);
        }else{
            System.out.println("That is not a valid answer");
        }
     }
}

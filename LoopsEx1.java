import java.util.*;
public class LoopsEx1 {
    public static void main(String[] args){
        boolean flag = true;
        try(Scanner scan = new Scanner(System.in)){
            do{
            System.out.println("\tEnter the number for the function you'd like to run");
            System.out.println("0.Exit Program\n1.String Palindrome\n2.Number Palindrome\n3.Sum of the Digits");
            int choice = scan.nextInt();
            switch(choice){
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("String Palindrome Func");
                    break;
                case 2:
                    System.out.println("Numeric Palindrome Func");
                    break;
                case 3:
                    System.out.println("Sum of Digits Func");
                    break;
                default:
                    System.out.println("Invalid Choice Try Again");
            }
        }while(flag);
        }
        catch(Exception e){
            System.out.println(e);
        }      
    }
}

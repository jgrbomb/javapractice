import java.util.*;
public class LoopsEx1 {

    public static void main(String[] args){
        boolean flag = true;
        try{
            Scanner scan = new Scanner(System.in);
            do{
                System.out.println("Enter the number for the function you'd like to run");
                System.out.println("\t0.Exit Program\n\t1.String Palindrome\n\t2.Number Palindrome\n\t3.Sum of the Digits\nOption Number: ");
                int choice = scan.nextInt();
                switch(choice){
                    case 0:
                        System.out.println("Exiting Program...");
                        flag = false;
                        break;
                    case 1:
                        StrPalindrome(scan);
                        break;
                    case 2:
                        NumPalindrome(scan);
                        break;
                    case 3:
                        SumDigits(scan);
                        break;
                    default:
                        System.out.println("Invalid Choice Try Again");
                }
            }while(flag);
            scan.close();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid Choice");
        }
        catch(Exception e){
            System.out.println(e);
        }      
    }
    public static void StrPalindrome(Scanner input){
        try{
            System.out.print("Enter Word: ");
            String word = input.next();
            String str = "";
            for(int i = word.length()-1; i >= 0; i--){
                str = str + word.charAt(i);
            }
            if(str.toLowerCase().equals(word.toLowerCase())){
                System.out.println(word + " is a palindrome");
            }
            else{
                System.out.println(word + " is not a palindrome");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void NumPalindrome(Scanner input){
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        int temp = num;
        int reversed = 0;
        int remainder;
        while(temp != 0){
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        }
        if(reversed == num){
            System.out.println(num + " is a numeric palindrome");
        }
        else{
            System.out.println(num + " is not a numeric palindrome");
        }
    }
    public static void SumDigits(Scanner input){
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while(temp != 0){
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("The sum of the digits in " + num + " is: " + sum);

    }
}

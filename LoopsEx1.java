import java.util.*;
public class LoopsEx1 {

    public static void main(String[] args){
        boolean flag = true;
        try{
            Scanner scan = new Scanner(System.in);
            // runs until stop character is input('0')
            do{
                System.out.println("Enter the number for the function you'd like to run");
                System.out.println("\t0.Exit Program\n\t1.String Palindrome\n\t2.Number Palindrome\n\t3.Sum of the Digits\nOption Number: ");
                int choice = scan.nextInt();
                switch(choice){
                    // if the first input is put in quit program
                    case 0:
                        System.out.println("Exiting Program...");
                        flag = false;
                        break;
                    // determines if a word is a palindrome
                    case 1:
                        StrPalindrome(scan);
                        break;
                    // determines if the number is a palindrome
                    case 2:
                        NumPalindrome(scan);
                        break;
                    // Sum the digits of a number
                    case 3:
                        SumDigits(scan);
                        break;
                    default:
                        // Invalid if input is not a number or greater than 3
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
            // user input for a word
            System.out.print("Enter Word: ");
            String word = input.next();
            String str = "";
            // stores copy of reversed word
            for(int i = word.length()-1; i >= 0; i--){
                str = str + word.charAt(i);
            }
            // if the two words are the same the word is a palindrome
            if(str.toLowerCase().equals(word.toLowerCase())){
                System.out.println(word + " is a palindrome");
            }
            // otherwise the word is not a palindrome
            else{
                System.out.println(word + " is not a palindrome");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void NumPalindrome(Scanner input){
        // user input for a number
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        int temp = num;
        int reversed = 0;
        int remainder;
        // stores a copy of the number in reverse
        while(temp != 0){
            remainder = temp % 10;
            reversed = reversed * 10 + remainder;
            temp /= 10;
        }
        // if the two numbers are the same the number is a palindrome
        if(reversed == num){
            System.out.println(num + " is a numeric palindrome");
        }
        // otherwise the number is not a palindrome
        else{
            System.out.println(num + " is not a numeric palindrome");
        }
    }
    public static void SumDigits(Scanner input){
        // user input for a number
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        // removes each digit and adds it to the total sum
        while(temp != 0){
            sum += temp % 10;
            temp /= 10;
        }
        // prints the sum
        System.out.println("The sum of the digits in " + num + " is: " + sum);

    }
}

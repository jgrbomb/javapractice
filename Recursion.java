import java.util.*;
public class Recursion{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // runs until stop character is input('0')
        while(true){
            // user input for a word
            System.out.println("Enter a possible palindrome(Enter 0 to exit):");
            String input = scan.next();
            // if the input is '0' quit running
            if(input.equals("0")){
                break;
            }
            // if the function returns true the word is a palindrome
            if(palindrome(input)){
                System.out.println("This word is a palindrome");
            }
            // otherwise the word is not a palindrome
            else{
                System.out.println("This word is not a palindrome");
            }
        }
        scan.close();
    }
    public static boolean palindrome(String str){
        // if the passed in string is less than 2 letters return true
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        // if the first and last letters match remove the first and last letters
        // and pass the remaining letters to the function
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return palindrome(str.substring(1, str.length()-1));
        }
        // if the first and last characters dont match return false
        return false;
    }
}
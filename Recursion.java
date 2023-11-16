import java.util.*;
public class Recursion{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter a possible palindrome(Enter 0 to exit):");
            String input = scan.next();
            if(input.equals("0")){
                break;
            }
            if(palindrome(input)){
                System.out.println("This word is a palindrome");
            }
            else{
                System.out.println("This word is not a palindrome");
            }
        }
        scan.close();
    }
    public static boolean palindrome(String str){
        if(str.length() == 0 || str.length() == 1){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length()-1)) {
            return palindrome(str.substring(1, str.length()-1));
        }
        return false;
    }
}
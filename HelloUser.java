import java.util.*;
public class HelloUser {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("What is your name?");
            String name = scan.nextLine();
            System.out.println("Hello " + name);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

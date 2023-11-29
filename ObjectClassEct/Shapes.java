package ObjectClassEct;
import java.util.*;

public class Shapes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            boolean flag = true;
            // runs into stop character('0') is input
            do{
                System.out.print("Select an Option:\n\t1.Rectangle\n\t2.Triangle\n\t3.Circle\n\t0.EXIT\nChoice: ");
                int choice = scan.nextInt();
                switch(choice){
                    // if the first choice is input quit program
                    case 0:
                        System.out.println("Exiting Program...");
                        flag = false;
                        break;
                    // creates a rectangle using user input
                    case 1:
                        System.out.print("Enter a length: ");
                        int l = scan.nextInt();
                        System.out.print("Enter a width: ");
                        int w = scan.nextInt();
                        rectangle rect = new rectangle(l, w);
                        // prints info for the rectangle
                        System.out.println(rect);
                        break;
                    // creates a triangle using user input
                    case 2:
                        System.out.print("Enter a base: ");
                        int b = scan.nextInt();
                        System.out.print("Enter a height: ");
                        int h = scan.nextInt();
                        triangle tri = new triangle(b, h);
                        // prints info for the triangle
                        System.out.println(tri);
                        break;
                    // creates circle using user input
                    case 3:
                        System.out.print("Enter a radius: ");
                        int r = scan.nextInt();
                        circle circ = new circle(r);
                        // prints info for the circle
                        System.out.println(circ);
                        break;
                    default:
                        // Invalid is input is not a number or greater than 3
                        System.out.println("Invalid Choice Try Again");

                }
            }while(flag);
            scan.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

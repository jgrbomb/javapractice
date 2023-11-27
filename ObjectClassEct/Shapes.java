package ObjectClassEct;
import java.util.*;

public class Shapes {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            boolean flag = true;
            do{
                System.out.print("Select an Option:\n\t1.Rectangle\n\t2.Triangle\n\t3.Circle\n\t0.EXIT\nChoice: ");
                int choice = scan.nextInt();
                switch(choice){
                    case 0:
                        System.out.println("Exiting Program...");
                        flag = false;
                        break;
                    case 1:
                        System.out.print("Enter a length: ");
                        int l = scan.nextInt();
                        System.out.print("Enter a width: ");
                        int w = scan.nextInt();
                        rectangle rect = new rectangle(l, w);
                        System.out.println(rect);
                        break;
                    case 2:
                        System.out.print("Enter a base: ");
                        int b = scan.nextInt();
                        System.out.print("Enter a height: ");
                        int h = scan.nextInt();
                        triangle tri = new triangle(b, h);
                        System.out.println(tri);
                        break;
                    case 3:
                        System.out.print("Enter a radius: ");
                        int r = scan.nextInt();
                        circle circ = new circle(r);
                        System.out.println(circ);
                        break;
                    default:
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

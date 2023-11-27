package ObjectClassEct;

public class circle {
    private int radius;
    public circle(int r){
        this.radius = r;
    }
    public int area(){
        return (int)(3.14 * Math.pow((double)this.radius,2));
    }
    public String toString(){
        return "Circ(" + this.radius + ", " + this.area() + ")";
    }
}

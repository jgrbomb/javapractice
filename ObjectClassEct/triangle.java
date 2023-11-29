package ObjectClassEct;

// triangle with a base,height, and calcuated area
public class triangle {
    private int base;
    private int height;
    public triangle(int b, int h){
        this.base = b;
        this.height = h;
    }
    public int area(){
        return (int)(this.base * this.height)/2;
    }
    public String toString(){
        return "Tri(" + this.base + ", " + this.height + ", " + this.area() + ")";
    }
}

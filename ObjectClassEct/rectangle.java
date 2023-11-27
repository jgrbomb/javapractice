package ObjectClassEct;

public class rectangle {
    private int length;
    private int width;
    public rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(){
        return this.length * this.width;
    }
    public String toString(){
        return "Rect(" + this.length + ", " + this.width + ", " + this.area() + ")";
    }
}

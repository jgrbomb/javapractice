package ObjectClassEct;

public class Dog extends Animal{
    private String name;
    public Dog(String type, String species, String name){
        super(type, species);
        this.name = name;
    }
    public void noise(){
        System.out.println(this.name + ": BARK!");
    }
    public String toString(){
        return this.species + "(" + this.type + ")" + "\nName: " + this.name; 
    }
    
}

package ObjectClassEct;

// child Dog class to Animal with type,species,and name
public class Dog extends Animal{
    private String name;
    public Dog(String type, String species, String name){
        super(type, species);
        this.name = name;
    }
    // overrides parents sound function
    public void noise(){
        System.out.println(this.name + ": BARK!");
    }
    public String toString(){
        return this.species + "(" + this.type + ")" + "\nName: " + this.name; 
    }
    
}

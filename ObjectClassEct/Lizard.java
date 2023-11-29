package ObjectClassEct;

// child Lizard class to Animal with type,species,and name
public class Lizard extends Animal {
    private String name;
    public Lizard(String type, String species, String name){
        super(type, species);
        this.name = name;
    }
    // overrides parent sound function
    public void noise(){
        System.out.println(this.name + ": HISSSSS!");
    }
    public String toString(){
        return this.species + "(" + this.type + ")" + "\nName: " + this.name;
    }
    
}

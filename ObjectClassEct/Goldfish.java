package ObjectClassEct;

// child Goldfish class to Animal with type,species,and name
public class Goldfish extends Animal {
    private String name;
    public Goldfish(String type, String species, String name) {
        super(type, species);
        this.name = name;
    }
    // overrides parent sound function
    public void noise(){
        System.out.println(this.name + ": BLUB!");
    }
    public String toString(){
        return this.species + "(" + this.type + ")" + "\nName: " + this.name;
    }
    
}

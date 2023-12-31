package ObjectClassEct;

// parent Animal class with a type,species, and sound function
public class Animal {
    protected String type;
    protected String species;
    public Animal(String type, String species){
        this.type = type;
        this.species = species;
    }
    public void noise(){
        System.out.println("...");
    }
    public String toString(){
        return this.species + "(" + this.type + ")";
    }
}

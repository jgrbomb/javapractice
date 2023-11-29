package ObjectClassEct;

public class Animals {
    public static void main(String[] args){
        // creates instances of different animals
        Animal a = new Animal("Amphibian", "Frog");
        Animal b = new Dog("Mammal", "Dog", "Spike");
        Animal c = new Lizard("Reptile", "Lizard", "Lizzy");
        Animal d = new Goldfish("Fish","Goldfish", "Shiny");
        // prints info for each animal
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
        Animal[] arr = new Animal[4];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        // prints the sound each animal would make
        for(Animal i:arr){
            i.noise();
        }
    }
}

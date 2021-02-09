package animalkingdom;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Comparator;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Animal Kingdom App Created");
        // create mammals 
        Mammal panda = new Mammal("Panda", 1869);
        System.out.println(panda);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        // create birds
        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        // create fish
        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);
        
       
        List<Animal> myAnimalKingdom = new ArrayList<>();
        myAnimalKingdom.add(panda);
        myAnimalKingdom.add(zebra);
        myAnimalKingdom.add(koala);
        myAnimalKingdom.add(sloth);
        myAnimalKingdom.add(armadillo);
        myAnimalKingdom.add(raccoon);
        myAnimalKingdom.add(bigfoot);

        myAnimalKingdom.add(pigeon);
        myAnimalKingdom.add(peacock);
        myAnimalKingdom.add(toucan);
        myAnimalKingdom.add(parrot);
        myAnimalKingdom.add(swan);

        myAnimalKingdom.add(salmon);
        myAnimalKingdom.add(catfish);
        myAnimalKingdom.add(perch);
        
        // prints all animal instances
        System.out.println(myAnimalKingdom.toString());
        // prints description of each animal on a new line
        myAnimalKingdom.forEach((a) -> System.out.println(a.printDescription()));

        // print all of the animals by Descending order by year named
        System.out.println("\n");
        System.out.println("My Animal Kingdom: Reverse order by date ");
        myAnimalKingdom.sort(Comparator.comparing(Animal::getYear).reversed());
        System.out.println(myAnimalKingdom.toString());

        // list all the animals alphabetically
        System.out.println("\n");
        System.out.println("My Animal Kingdom: Alphabetical by animal name ");
        myAnimalKingdom.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        System.out.println(myAnimalKingdom.toString());

        // list all the animals in order by how they move
        System.out.println("\n");
        System.out.println("My Animal Kingdom: In order by how they move (fly, swim, walk) ");
        myAnimalKingdom.sort((a1, a2) -> a1.getMove().compareToIgnoreCase(a2.getMove()));
        System.out.println(myAnimalKingdom.toString());
        //List<Animals> filteredList = filterAnimals(myAnimalKingdom, (a) -> )
    }
}
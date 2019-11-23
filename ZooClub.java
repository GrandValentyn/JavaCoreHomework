import java.util.*;

public class ZooClub {

    Scanner scanner = new Scanner(System.in);
    Map<Person, List<Animal>> map = new HashMap<>();

    public void add_member(){
        System.out.println("add new member to club");
        List<Animal> animals = new ArrayList<>();
        map.put(Person.add_new_person(),animals);

    }
    public void add_animal_for_member(){
        System.out.println("Input a  new person");
        Person person =  Person.add_new_person();
        System.out.println("input a new animal");
        map.get(person).add(Animal.add_new_animal());

    }
    public void delete_member(){
        System.out.println("Input a person for delete");
        Person person = Person.add_new_person();
        map.remove(person);
    }
    public void delete_animal(){
        System.out.println("Input animal for delete");
        Animal animal = Animal.add_new_animal();

    }



}


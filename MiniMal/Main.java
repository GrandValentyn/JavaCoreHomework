package MiniMal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Person_Constructor Arny = new Person_Constructor("Arny",20);
        Person_Constructor Tommy = new Person_Constructor("Artur",34);
        Person_Constructor John = new Person_Constructor("Mike",17);
        Person_Constructor Max = new Person_Constructor("Max", 12);

        ArrayList<Person_Constructor> people = new ArrayList<>();

        people.add(Arny);
        people.add(Tommy);
        people.add(John);
        people.add(Max);

         Set<Person_Constructor> people_sort_by_name = new HashSet<>(people);
        for (Person_Constructor p : people_sort_by_name
                ) {
            System.out.println(p);

        }
        System.out.println();
        System.out.println();
        System.out.println();

        Set<Person_Constructor> people_sort_age = new TreeSet<>(new Comparebyage());
        people_sort_age.addAll(people);

        System.out.println(people_sort_age);

        for (Person_Constructor l:people_sort_age
             ) {
            System.out.println(l);

        }






        }
    }


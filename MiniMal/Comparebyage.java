package MiniMal;

import java.util.Comparator;

public class Comparebyage implements Comparator<Person_Constructor> {

    @Override

        public int compare(Person_Constructor o1, Person_Constructor o2){
        return o1.getAge() - o2.getAge();

    }
}

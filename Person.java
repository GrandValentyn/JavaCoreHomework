import java.util.Objects;
import java.util.Scanner;

public class Person {
     static Scanner scanner = new Scanner(System.in);
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "scanner=" + scanner +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(scanner, person.scanner) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanner, name, age);
    }

    public Person(String name, String age) {


    }

    public static Person add_new_person() {
        System.out.println("Add new member to club");
        String name;
        String age;
        System.out.println("Input a name person");
        name = scanner.nextLine();
        System.out.println("Input a age person");
        age = scanner.next();

       return new Person(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

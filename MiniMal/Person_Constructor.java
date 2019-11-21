package MiniMal;

public class Person_Constructor {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person_Constructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Person_Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
 }

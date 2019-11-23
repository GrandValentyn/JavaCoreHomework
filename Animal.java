import java.util.Scanner;

public class Animal {
   static Scanner scanner = new Scanner(System.in);
    private static String type;
    private static String name;


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public    String getType() {
        return type;
    }

    public   void setType(String type) {
        this.type = type;
    }

    public   String getName() {
        return name;
    }

    public   void setName(String name) {
        this.name = name;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;

    }
    public static Animal add_new_animal(){
        System.out.println("Input a new animal");
        type = scanner.nextLine();
        System.out.println("input a name");
        name = scanner.nextLine();
        return new Animal(type, name);

    }
}

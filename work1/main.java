package work1;

public class main {
    public static void main(String[] args) {
        Pet dog = () -> System.out.println("Im dog gav gav");
        Pet cow = () -> System.out.println("Im cow myyyyyyyyyy");
        Pet cat = () -> System.out.println("Im cat mayyyy");

        dog.voice();
        cow.voice();
        cat.voice();




     }
}

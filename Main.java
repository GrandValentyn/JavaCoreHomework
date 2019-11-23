import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your choise");
        String choice = scanner.nextLine();

        while(!choice.equalsIgnoreCase("quit")){
            switch (choice){
                case "1":
                    zooClub.add_member();
                case "2":
                    zooClub.add_animal_for_member();
                case "3":
                    zooClub.delete_member();
                case "4":
                    zooClub.delete_animal();

            }
        }

    }
}

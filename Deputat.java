import java.util.Scanner;

public class Deputat  {
    Human human = new Human();
    String second_name;
    String name;
    boolean habarnuk;


    @Override
    public String toString() {
        return "Deputat{" +
                "human=" + human +
                ", second_name='" + second_name + '\'' +
                ", name='" + name + '\'' +
                ", habarnuk=" + habarnuk +
                '}';
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHabarnuk() {
        return habarnuk;
    }

    public void setHabarnuk(boolean habarnuk) {
        this.habarnuk = habarnuk;
    }
    private void give_Habar(boolean habarnuk){
        habarnuk = this.habarnuk;
        if(habarnuk = false){
            System.out.println("Цей депутат не бере філки");
        }
        else {
            System.out.println("Розмір взятки");
            Scanner scanner_habar = new Scanner(System.in);
            int money = scanner_habar.nextInt();


            if(money > 5000){

                System.out.println("Миліція повяже скотиняку");
            }
            else{
                System.out.println(money);
            }


        }
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Frakcia extends Deputat {
    List<String> deputats_in_frakcia = new ArrayList<>();
    List<String> Habar_deputats = new ArrayList<>();
    public Frakcia getFrakcia() {
        return frakcia;
    }

    public void setFrakcia(Frakcia frakcia) {
        this.frakcia = frakcia;
    }

    Frakcia frakcia  ;
    Deputat deputat  ;

    public Deputat getDeputat() {
        return deputat;
    }

    public void setDeputat(Deputat deputat) {
        this.deputat = deputat;
    }

    void add_Deputat() {
        name = this.name;
        second_name = this.second_name;
        System.out.println("Введіть імя Депутата ");
        Scanner add_deputat_name = new Scanner(System.in);
        name = add_deputat_name.nextLine();
        System.out.println("Введіть Прізвище Депутата");
        Scanner add_deputat_secondname = new Scanner(System.in);
        second_name = add_deputat_secondname.nextLine();
        System.out.println(" добавлено нового Депутата :" + name + "" + second_name);

        deputats_in_frakcia.add( name + second_name);

    }

    void remove_Deputat() {
         String name2;
         String second_name2;

        System.out.println("Введіть імя Депутата ");
        Scanner add_deputat_name = new Scanner(System.in);
        name2 = add_deputat_name.nextLine();
        System.out.println("Введіть Прізвище Депутата");
        Scanner add_deputat_secondname = new Scanner(System.in);
        second_name2 = add_deputat_secondname.nextLine();
        System.out.println("Поперли Депутата :" + name2 + "" + second_name2);
         deputats_in_frakcia.remove(name2 + second_name2);
    }

    void Habarnuku() {

        Habar_deputats.add("Grigoriy Petuh");
        Habar_deputats.add("Lubomir Banditof");
        Habar_deputats.add("Narkoman Pavlic");
        Habar_deputats.add("Artem Pidorovich");
        Habar_deputats.add(" Amvrosiy Filipovich");
        System.out.println("Всі хабарники фракції");


        for (String hab:Habar_deputats
             ) {
            System.out.println(hab);

        }

    }

    void The_Most_Habarnuy() {
        Habar_deputats.get(2);

    }
    void Deputats_in_Frakcia(){

        deputats_in_frakcia.add("Grigoriy Petuh");
        deputats_in_frakcia.add("Lubomir Banditof");
        deputats_in_frakcia.add("Narkoman Pavlic");
        deputats_in_frakcia.add("Artem Pidorovich");
        deputats_in_frakcia.add(" Amvrosiy Filipovich");
        deputats_in_frakcia.add(" Gosha Rubchisky");
        deputats_in_frakcia.add("Alex Monarco ");
        deputats_in_frakcia.add("Maksim Zaluposranskiy ");

        System.out.println("Всі Депутати фракції");

    }

    @Override
    public String toString() {
        return "Frakcia{" +
                "deputat=" + deputat +
                '}';
    }

    void Delete_Deputats_of_Frakcia() {
        List<String> deputats_in_frakcia = new ArrayList<>();
        deputats_in_frakcia.removeAll(deputats_in_frakcia);

        System.out.println("Всі Депутати вигнані з Фракції");


    }
}
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Verhovna_Rada extends Frakcia {
    Frakcia frakcia = new Frakcia();
    List<String> Habar_deputats = new ArrayList<>();
    List<String> deputats_in_frakcia = new ArrayList<>();

     List<String> Frakcias = new LinkedList<>();

    @Override
    public String toString() {
        return "Verhovna_Rada{" +
                "frakcia=" + frakcia +
                ", Habar_deputats=" + Habar_deputats +
                ", deputats_in_frakcia=" + deputats_in_frakcia +
                ", Frakcias=" + Frakcias +
                '}';
    }

    public Frakcia getFrakcia() {
        return frakcia;
    }

    public void setFrakcia(Frakcia frakcia) {
        this.frakcia = frakcia;
    }

    public List<String> getHabar_deputats() {
        return Habar_deputats;
    }

    public void setHabar_deputats(List<String> habar_deputats) {
        Habar_deputats = habar_deputats;
    }

    public List<String> getDeputats_in_frakcia() {
        return deputats_in_frakcia;
    }

    public void setDeputats_in_frakcia(List<String> deputats_in_frakcia) {
        this.deputats_in_frakcia = deputats_in_frakcia;
    }

    public LinkedList<String> getFrakcias() {
        return (LinkedList<String>) Frakcias;
    }

    public void setFrakcias(LinkedList<String> frakcias) {
        Frakcias = frakcias;
    }

    void add_frakcia(){
         Frakcias.add("Frakcia1");
         System.out.println("Frakcia1 add");
     }
     void delete_frakcia(){
         Frakcias.remove("Frakcia1");
         System.out.println("Frakcia1 delete");
     }
     void all_Frakcia(){
         Frakcias.add("Frackia2");
         Frakcias.add("Frackia3");
         Frakcias.add("Frackia4");
         Frakcias.add("Frackia5");
         Frakcias.add("Frackia6");
         Frakcias.add("Frackia7");
         Frakcias.add("Frackia8");
         for (String F:Frakcias
              ) {
             System.out.println(F);

         }

     }

     void wiev_Frakcia2(){

//       int index = 2;
//         System.out.println(Frakcias.get(index));
         System.out.println("Frakcia2");
     }


    void Habarnuku() {

        Habar_deputats.add("Grigoriy Petuh");
        Habar_deputats.add("Lubomir Banditof");
        Habar_deputats.add("Narkoman Pavlic");
        Habar_deputats.add("Artem Pidorovich");
        Habar_deputats.add(" Amvrosiy Filipovich");

        System.out.println("Всі хабарники фракції");


        for (String H:Habar_deputats
             ) {
            System.out.println(H);
        }

        }

        void The_Most_Habarnuk(){
            System.out.println("Narkoman Pavlic");




        }

        void Deputats(){
            for (String dof:deputats_in_frakcia
                 ) {
                System.out.println(dof);

            }
        }



}

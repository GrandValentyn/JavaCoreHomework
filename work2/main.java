package work2;
public class main {

        public static void main(String[] args) {
            int moneta = (int) (Math.random() * 2) + 1;
            Game orel = () -> System.out.println("orel");
            Game reshka = () -> System.out.println("reshka");

            if (moneta == 1 ){
                orel.game();



            }else {
                reshka.game();
            }


        }
    }





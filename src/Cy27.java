import java.util.Random;

public class Cy27   extends Plane {



            public void Turboboost() {
                int min4 = 1000;
                int max4 = 3700;
                int diff4 = max4 - min4;
                Random random4 = new Random();
                int randomspeedturboboost = random4.nextInt(diff4 + 1);
                System.out.println("Turboboost speed" + randomspeedturboboost);


            }

            public void Stels() {
                int min5 = 10;
                int max5 = 55;
                int diff5 = max5 - min5;
                Random random5 = new Random();
                int randomstels = random5.nextInt(diff5 + 1);
                System.out.println("Літака не видно протягом даного часу" + randomstels);

            }

            public void Nukeshot() {
                int min6 = 1;
                int max6 = 10;
                int diff6 = max6 - min6;
                Random random6 = new Random();
                int randombomb = random6.nextInt(diff6 + 1);
                System.out.println(" Бомб скинуто" + randombomb);

            }

            public  void Cy27(){
            int maxspeed = 3700;
            String Grey;


            }













        }




import java.util.Random;

public abstract class Plane extends Mechanic {
   public  void engine() {
       int min2 = 20;
       int max2 = 88;
       int diff2 = max2 - min2;
       Random  random2 = new Random();
       int randomengine = random2.nextInt(diff2 + 1);
       System.out.println(" Стартуєм через "+  randomengine);

   }

   public void fuel(){
       int min3 = 0; int max3 = 1000;
       int diff3 = max3 - min3;
       Random random3 = new Random();
       int randomfuel = random3.nextInt(diff3 + 1);
       System.out.println("Запас ходу "+ randomfuel);
   }

   public void endrace(){
       System.out.println("Літак йде на посадку");

   }
   public  void planeharactery(){
       int planelong = 40;
       int planewidth = 15;
       int planeweight = 40;
   }

















}


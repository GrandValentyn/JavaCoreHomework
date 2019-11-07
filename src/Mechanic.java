import java.util.Random;

public class Mechanic  implements Planefitch{
    Mechanic mechanic;
    public void waydown(){
        int min1 = 1; int max1 = 1000;
        int diff1 = max1 - min1;
        Random random1  = new Random();
        int randomwayplane = random1.nextInt(diff1 + 1);
        System.out.println("Літак полетить вниз " + randomwayplane);
    }
    public void wayup(){
        int min1 = 1; int max1 = 1000;
        int diff1 = max1 - min1;
        Random random1  = new Random();
        int randomwayplane = random1.nextInt(diff1 + 1);
        System.out.println("Літак полетить у верх"+ randomwayplane);
    }
    public void wayleft(){
        int min1 = 1; int max1 = 1000;
        int diff1 = max1 - min1;
        Random random1  = new Random();
        int randomwayplane = random1.nextInt(diff1 + 1);
        System.out.println(" Літак полетить наліво  "+ randomwayplane);
    }
    public void wayright(){
        int min1 = 1; int max1 = 1000;
        int diff1 = max1 - min1;
        Random random1  = new Random();
        int randomwayplane = random1.nextInt(diff1 + 1);
        System.out.println(" Літак полетить направо"+ randomwayplane);
    }




}

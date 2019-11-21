import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static TreeSet<Commodity> commodities = new TreeSet<>();




    public static void main(String[] args) {
        System.out.println("input CHOISE");


        String choise = scanner.next();
        while(!choise.equalsIgnoreCase("Quit")){
            switch (choise){
                case "1":
                    add_commodity();
                    break;
                case "2":
                    delete_cammodity();
                    break;
                case "3":
                    replace_commodity();
                    break;
                case "4":
                    sort_by_name();
                    break;
                case "5":
                    sort_by_length();
                    break;
                case "6":
                    sort_by_width();
                    break;
                case "7":
                    sort_by_weight();
                    break;
                case "8":
                    wievelementbyindex();
                    break;
                case "9":
                    System.exit(0);
                    break;



            }
        }


    }

    private static void wievelementbyindex() {
        System.out.println("input index");
        int index = scanner.nextByte();
        Iterator iterator = commodities.iterator();

        int runner = 0;
        while (iterator.hasNext()){
            iterator.next();
            runner++;
            if(runner == index){
                Commodity commodity = (Commodity) iterator.next();
                System.out.println(commodity);
                break;
            }
        }
    }

    private static void sort_by_weight() {
        TreeSet commodities1 = new TreeSet<Commodity>(new Sort_by_weight());
        commodities1.addAll(commodities);
        System.out.println("sort by weight");
        for (Object we:commodities1
             ) {
            System.out.println(we);

        }
    }

    private static void sort_by_width() {
        TreeSet comodities1 = new TreeSet<Commodity>(new Sort_by_width());
        comodities1.addAll(commodities);
        System.out.println("sort by width");
        for (Object wi:comodities1
             ) {
            System.out.println(wi);

        }
    }

    private static void sort_by_length() {
        TreeSet commodities1 = new TreeSet<Commodity>(new Sort_by_length());
        commodities1.addAll(commodities);
        System.out.println("sort by length");
        for (Object l :commodities1
             ) {
            System.out.println(l);

        }


    }

    private static void sort_by_name() {
        TreeSet comodities1 = new TreeSet<Commodity>(new Sort_by_name());
        comodities1.addAll(commodities);
        System.out.println("Sorted by name");
        for (Object n:comodities1
             ) {
            System.out.println(n);

        }
    }

    private static void replace_commodity() {
        System.out.println("replace commodity");
        boolean InCollection =  delete_cammodity();
        if (InCollection){
            System.out.println("input a new commodity");
            add_commodity();
        }


    }

    private static boolean delete_cammodity() {
        System.out.println("commodity name");
        String name = scanner.next();
        System.out.println("commodity length");
        Double length = scanner.nextDouble();
        System.out.println("Commodity width");
        Double width = scanner.nextDouble();
        System.out.println("commodity weight");
        Double weight = scanner.nextDouble();

        commodities.remove(new Commodity(name,weight,width,length));
        System.out.println();

        return false;
    }

    private static void add_commodity() {
        System.out.println("commodity name");
        String name = scanner.next();
        System.out.println("commodity length");
        Double length = scanner.nextDouble();
        System.out.println("Commodity width");
        Double width = scanner.nextDouble();
        System.out.println("commodity weight");
        Double weight = scanner.nextDouble();

            System.out.println("commodity add");
        }


    }



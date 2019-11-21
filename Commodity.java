import java.util.Comparator;
import java.util.TreeSet;

public class Commodity implements Comparable<Commodity> {
    String name;
    Double weight;
    Double length;
    Double width;


    public Commodity() {
        super();
    }



    public Commodity(String name, Double weight, Double length, Double width, TreeSet<Commodity> commodities) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;

    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", length=" + length +
                ", width=" + width +
                '}';
    }



    public Commodity(String name, Double weight, Double width, Double length) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public int compareTo(Commodity commodity) {
        return 0;
    }
}

import java.util.Comparator;

public class Sort_by_weight implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (int) (o1.getWeight() - o2.getWeight()*1000);
    }
}

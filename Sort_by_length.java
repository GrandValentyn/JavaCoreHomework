import java.util.Comparator;

public class Sort_by_length implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return (int) (o1.getLength() - o2.getLength()*1000);
    }
}

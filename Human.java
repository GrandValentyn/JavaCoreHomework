public class Human {
    int weight;
    int hight;

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", hight=" + hight +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }
}

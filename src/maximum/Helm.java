package maximum;

public class Helm {
     int diameter;
     String helmwheel ;


    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", helm='" + helmwheel + '\'' +
                '}';
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getHelm() {
        return helmwheel;
    }

    public void setHelm(String helm) {
        this.helmwheel = helm;
    }

    protected void setHelm() {

    }
}

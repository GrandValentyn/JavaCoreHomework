package maximum;

public class Engine extends Helm {
    int cilindres;

    @Override
    public String toString() {
        return "Engine{" +
                "cilindres=" + cilindres +
                '}';
    }

    public int getCilindres() {
        return cilindres;
    }

    public void setCilindres(int cilindres) {
        this.cilindres = cilindres;
    }
}

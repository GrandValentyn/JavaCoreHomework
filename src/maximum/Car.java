package maximum;

public class Car extends  Engine {
    int horsepower;
    int year;
    public Engine engine = new Engine();
    public Helm helm = new Helm();
    Car(){
        helm = new Helm();
        helm.setDiameter((int) (Math.random()*10 +10));
        helm.setHelm("Alkantara");
        engine = new Engine();
        engine.setCilindres((int)Math.random()*13 + 3);
        year = (int)(Math.random()*20 + 2000);
        horsepower = (int)(Math.random()*1500 + 60);

    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }



    public void setHelm(Helm helm) {
        this.helm = helm;
    }

    @Override
    public String toString() {
        return "Car{" +
                "horsepower=" + horsepower +
                ", year=" + year +
                ", engine=" + engine +
                ", helm=" + helm +
                '}';
    }
}


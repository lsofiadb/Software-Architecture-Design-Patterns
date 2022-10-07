package Cars;

public class NonLuxuryCar implements Car {

    private String name;

    public NonLuxuryCar(String cName) {
        this.name = cName;
    }

    public String getCarName() {
        return name;
    }

    public String getCarFeatures() {
        return "Non-Luxury Car Features ";
    }
}
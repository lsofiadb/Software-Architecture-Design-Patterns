package SUV;

public class LuxurySUV implements SUV {

    private String name;

    public LuxurySUV(String sName) {
        this.name = sName;
    }

    public String getSUVName() {
        return name;
    }

    public String getSUVFeatures() {
        return "Luxury SUV Features ";
    };
}
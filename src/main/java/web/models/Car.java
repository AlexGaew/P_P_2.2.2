package web.models;


public class Car {
    private String brandCar;
    private String modelCar;
    private String colorCar;

    public Car(String brandCar, String modelCar, String colorCar) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandCar='" + brandCar + '\'' +
                ", nodelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                '}';
    }
}

package web.model;

public class Car {
    private int carId;
    private String model;
    private String marka;

    public Car(int carId, String model, String marka) {
        this.carId = carId;
        this.model = model;
        this.marka = marka;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}

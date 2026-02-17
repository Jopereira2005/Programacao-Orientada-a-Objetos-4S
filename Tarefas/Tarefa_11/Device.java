package Tarefa_11;

public abstract class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public abstract void TurnOn();
    public abstract void TurnOff();
    public abstract void PlayMedia(IMedia media);
    public abstract void StopMedia(IMedia media);

}

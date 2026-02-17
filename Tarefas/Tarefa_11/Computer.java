package Tarefa_11;

public class Computer extends Device implements IAdjustableVolume {
    public Computer(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void TurnOn() {
        System.out.println("Ligando o Computador: " + getBrand() + " " + getModel());
    }
    
    @Override
    public void TurnOff() {
        System.out.println("Desligando o Computador: " + getBrand() + " " + getModel());
    }
    
    @Override
    public void PlayMedia(IMedia media) {
        System.out.println("Computador Reproduzindo midia.");
        media.Play();
    }
    
    @Override
    public void StopMedia(IMedia media) {
        System.out.println("Computador Interrompendo midia.");
        media.Stop();
    }
    
    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Aumentando o volume do Computador em " + value);
    }
   
    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Diminuindo o volume do Computador em " + value);
    }
}

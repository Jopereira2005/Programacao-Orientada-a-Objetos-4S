package Tarefa_11;

public class Smartphone extends Device implements IScreenAdjustable, IAdjustableVolume {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void TurnOn() {
        System.out.println("Ligando o Celular: " + getBrand() + " " + getModel());
    }
    
    @Override
    public void TurnOff() {
        System.out.println("Desligando o Celular: " + getBrand() + " " + getModel());
    } 
    
    @Override
    public void PlayMedia(IMedia media) {
        System.out.println("Celular Reproduzindo midia");
        media.Play();
    }
    
    @Override
    public void StopMedia(IMedia media) {
        System.out.println("Celular Interrompendo midia");
        media.Stop();
    }
    
    @Override
    public void AdjustBrightness(int value) {
        System.out.println("Ajustando o brilho do Celular para " + value);
    }
   
    @Override
    public void AdjustContrast(int value) {
        System.out.println("Ajustando o contraste do Celular para " + value);
    }
    
    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Aumentando o volume do Celular em " + value);
    }
   
    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Diminuindo o volume do Smartphone em " + value);
    }
}
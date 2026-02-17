package Tarefa_11;

public class TV extends Device implements IScreenAdjustable, IAdjustableVolume {
    public TV(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void TurnOn() {
        System.out.println("Ligando a Televisao: " + getBrand() + " " + getModel());
    }
    
    @Override
    public void TurnOff() {
        System.out.println("Desligando a Televisao: " + getBrand() + " " + getModel());
    } 
    
    @Override
    public void PlayMedia(IMedia media) {
        System.out.println("Televisao Reproduzindo midia");
        media.Play();
    }
    
    @Override
    public void StopMedia(IMedia media) {
        System.out.println("Televisao Interrompendo midia");
        media.Stop();
    }
    
    @Override
    public void AdjustBrightness(int value) {
        System.out.println("Ajustando o brilho da Televisao para " + value);
    }
   
    @Override
    public void AdjustContrast(int value) {
        System.out.println("Ajustando o contraste da Televisao para " + value);
    }
    
    @Override
    public void IncreaseVolume(int value) {
        System.out.println("Aumentando o volume da Televisao em " + value);
    }
   
    @Override
    public void DecreaseVolume(int value) {
        System.out.println("Diminuindo o volume da Televisao em " + value);
    }
}
package Tarefa_11;

public class Main_Devices {
    public static void main(String[] args) {
        TV tv = new TV("Samsumg", "OLED");
        Computer computador = new Computer("Acer", "Nitro V15");
        Smartphone smartphone = new Smartphone("Xiaomi", "Redmi Note 13");
        
        Audio podcast = new Audio(9000, "Broxada Sinistra");
        Video filme = new Video(5400, "Your Name");
        
        tv.TurnOn();
        tv.AdjustBrightness(20);
        tv.AdjustContrast(50);
        tv.DecreaseVolume(10);
        tv.PlayMedia(filme);
        tv.IncreaseVolume(10);
        tv.StopMedia(filme);
        tv.TurnOff();
        System.out.println("\n");
        
        computador.TurnOn();
        computador.DecreaseVolume(10);
        computador.PlayMedia(podcast);
        computador.IncreaseVolume(10);
        computador.StopMedia(podcast);
        computador.TurnOff();
        System.out.println("\n");

        smartphone.TurnOn();
        smartphone.AdjustBrightness(100);
        smartphone.AdjustContrast(30);
        smartphone.DecreaseVolume(20);
        smartphone.PlayMedia(filme);
        smartphone.IncreaseVolume(30);
        smartphone.StopMedia(filme);
        smartphone.TurnOff();
    }
}

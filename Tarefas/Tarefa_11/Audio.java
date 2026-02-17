package Tarefa_11;

public class Audio extends Media implements IMedia {
    public Audio(int duration, String title) {
        super(duration, title);
    }
    
    @Override
    public void Play() {
        System.out.println("Reproduzindo o audio: " + getTitle() + ", " + getDuration() + "s");
    } 
    
    @Override
    public void Stop() {
        System.out.println("Interrompendo o audio: " + getTitle() + ", " + getDuration() + "s");
    }
}
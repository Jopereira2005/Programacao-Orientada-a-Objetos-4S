package Tarefa_11;

public class Video extends Media implements IMedia {
    public Video(int duration, String title) {
        super(duration, title);
    }
    
    @Override
    public void Play() {
        System.out.println("Reproduzindo o video: " + getTitle() + ", " + getDuration() + "s");
    } 
    
    @Override
    public void Stop() {
        System.out.println("Interrompendo o video: " + getTitle() + ", " + getDuration() + "s");
    }
}

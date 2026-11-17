package Zajecia_2.Zad1;

public class TimeCounting {
    private long startTime;
    private long resumeTime;

    public void start() {
        //nanoTime() - daje to jaki jest czas w procesorze teraz (kiedy jest wywyołana) w nanosekundach
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.resumeTime = System.nanoTime() - this.startTime;
    }

    public long getResumeTime() {
        return this.resumeTime;
    }
}

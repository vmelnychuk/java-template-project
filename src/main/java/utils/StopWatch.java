package utils;

public class StopWatch {
    private long start;

    public void start() {
        this.start = System.nanoTime();
    }
    public long stop() {
        long now = System.nanoTime();
        return now - start;
    }
}

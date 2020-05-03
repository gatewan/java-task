import java.util.Timer;
public class RunningTask {
    public static void main (String[] args) {
        Timer tm = new Timer();
        tm.schedule(new MyTask(), 0,1000);
    }
    
}

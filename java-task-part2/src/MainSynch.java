
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MainSynch {
    public static void main(String[] args){
        System.out.println("Demo, thread tanpa sinkronisasi");
        Counter shared = new UnSynchCounter();
        ExecutorService app= Executors.newCachedThreadPool();
        app.execute(new MyTaskA("Thread1",shared));
        app.execute(new MyTaskB("Thread2",shared));
        app.execute(new MyTaskA("Thread3",shared));
        app.shutdown();
    }
}

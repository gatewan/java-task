
import java.util.Random;


public class MyTaskB implements Runnable{
    private final static Random random = new Random();
    private final Counter sharedCounter;
    private String threadName;
    public MyTaskB(String name, Counter shared){
        threadName=name;sharedCounter=shared;
    }
    public void run(){
        for(int i=0;i<3;i++){
            try{
                sharedCounter.decreament(threadName);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
}
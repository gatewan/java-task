import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class MyTask extends TimerTask{

@Override








public void run (){
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");
    System.out.println("MyTask.on"+ dt.format(cal.getTime()));
}
}

import java.util.Random;


public class UnSynchCounter  implements  Counter{
  private final static Random random = new Random();
  private  int val = 0;
  public void increament (String sender){
      int last = val;
      try {
          Thread.sleep(random.nextInt(500));
      }catch(InterruptedException ex){
          System.out.println(ex.getMessage());
      }
      val++;
      System.out.println(sender +"-Inc\tLas :"+last
            +"\tNew:"+val);
  }
    public void decreament (String sender) {
        int last = val;
        try{
            Thread.sleep(random.nextInt(500));
        }catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        val--;
        System.out.println(sender +"-Inc\tLast :"+last
                +"\tNew:"+val);
    }

    @Override
    public void increment(String sender) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

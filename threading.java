public class GetCurrentThread implements Runnable {

  Thread th;
  
  public GetCurrentThread(String threadName) {
  th= new Thread(this,threadName);
  th.start();
  }

  public void run() {
  System.out.println(th.getName()+" is starting.....");
  System.out.println("Current thread name : "+
  Thread.currentThread().getName());
  }

  public static void main(String args[]) {
  System.out.println("Current thread name : "+
  Thread.currentThread().getName());
  new GetCurrentThread("1st Thread");
  new GetCurrentThread("2nd Thread");
  }
}

//Output

/*

Current thread name : main
1st Thread is starting.....
Current thread name : 1st Thread
2nd Thread is starting.....
Current thread name : 2nd Thread

*/

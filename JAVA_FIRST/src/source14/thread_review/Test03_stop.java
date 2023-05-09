package source14.thread_review;
// 스레드종료 스톱메서드 활용 런메서드 실행종료를 위해 스톱메서드 호출즉시 스레드를
//종료하므로 사용중인 자원낭비 가능성이 있음. 스톱메서드는 가능하면 사용하지않도록 권고중
class stopThread extends Thread{
   public boolean stop;

   @Override
   public void run() {
      while(!stop) {
         System.out.println("실행중");
         try {
            Thread.sleep(30);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
   }
   
}
public class Test03_stop {

   public static void main(String[] args) {

      stopThread stopThread = new stopThread();
      stopThread.start();
      try {
         Thread.sleep(5000);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
      stopThread.stop = true;
   }

}
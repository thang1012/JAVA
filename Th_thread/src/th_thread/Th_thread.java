/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th_thread;

/**
 *
 * @author THANG NGUYEN
 */
public class Th_thread {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) 
      throws Exception {
      Thread thread = new MyThread();
      thread.start();
      if (thread.isAlive()) {
         System.out.println("Thread đang thực hiện");
      }
      else {
         System.out.println("Đã kết thúc");
      }
      // dl delay
      long dl = 5000; 
      thread.join(dl);
      if (thread.isAlive()) {
         System.out.println("thread chưa kết thúc");
      }
      else {
         System.out.println("Đã dừng");
      }
      thread.join();
   }
}

class MyThread extends Thread {
   boolean stop = false;
   public void run() {
      while (true) {
         if (stop) {
            return;
         }
      }
   }
    
}

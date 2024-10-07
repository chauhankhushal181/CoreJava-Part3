class F extends Thread{
    public void run(){
        for (int i =0;i <=100; i++)
        System.out.println("hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }

class G extends Thread{
    public void run(){
        for (int i = 0; i<=100; i++)
        System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Threads66 {
    public static void main(String[] args) {
        F obj = new F();
        G obj1 = new G();

        obj.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        obj1.start();
    }
}

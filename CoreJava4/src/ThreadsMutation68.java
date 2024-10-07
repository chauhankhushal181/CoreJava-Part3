class counter{
    int count;
    public void increment(){
        count++;
    }
}
public class ThreadsMutation68 {
    public static void main(String[] args) throws InterruptedException {

        counter c = new counter();

        Runnable obj = () -> {
            for (int i = 0; i <= 1000; i++)
            {
                c.increment();
            }
        };


        Runnable obj1 = () ->
        {
            for (int i = 0; i <= 1000; i++)
            {
                c.increment();
            }

        };

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);

        t1.start();
        t2.start();

        t1.join();
        t1.join();

        System.out.println(c.count);
    }
}

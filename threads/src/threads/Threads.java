package threads;


class MThread implements Runnable
{
    @Override
    public void run()
    {
       // System.out.println("MThread Running");
        
        System.out.println("Run by "+Thread.currentThread().getName());
    }
}


public class Threads  
{
    public static void main(String[] args) throws InterruptedException 
    {
        MThread m = new MThread();
        
        Thread first = new Thread(m);
        Thread second = new Thread(m);
        Thread third = new Thread(m);
        
        first.setName("First Thread");
        second.setName("Second Thread");
        third.setName("Third Thread");
        
        first.setPriority(10);
        second.setPriority(6);
        third.setPriority(2);
        
        first.start();
        second.start();
        third.start();
        
        first.join();
        second.join();
        third.join();
        System.out.println("Main Thread "+Thread.currentThread().getName());
    }  
}

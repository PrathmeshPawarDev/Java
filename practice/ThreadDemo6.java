class Demo6 extends Thread
{
    public void run()
    {
        System.out.println("Thread :"+Thread.currentThread().getName());
    }
}
class ThreadDemo6
{
    public static void main(String [] A)throws Exception
    {

        Demo6 dobj1 = new Demo6();
        Demo6 dobj2 = new Demo6();

        dobj1.setName("Thread_one");
        dobj2.setName("Thread_two");

        
        dobj1.start();
        dobj2.start();
        
        dobj1.join();
        dobj2.join();


        System.out.println("Main thread end :");
    }
}
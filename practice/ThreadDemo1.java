class ThreadDemo1
{
    public  static void main(String [] A)
    {
        System.out.println("Inside main ");

        Thread t= Thread.currentThread();

        System.out.println("Thread name :"+t.getName());

        System.out.println("Thread is Alive :"+t.isAlive());

        System.out.println("Thread priority :"+t.getPriority());

        System.out.printf("Thread id :"+t.getId());
    }
}
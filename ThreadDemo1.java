class TreadDemo1
{
    public static void main(String [] A)
    {
        System.out.println("Inside main");

        Thread t =Thread.currentThread();

        System.out.println("Current thread name is : "+t.getName());

        System.out.println("Current thread id is :"+t.getId());

        System.out.println("Thread is alive or not : "+t.isAlive());

        System.out.println(" thread Priority  is : "+t.getPriority() );

    }
}
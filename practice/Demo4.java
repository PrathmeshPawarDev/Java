class Hello
{
    public int No1;
    public int No2;


    Hello(int i,int j)
    {
        No1=i;
        No2=j;

        System.out.println(No1+No2);
    }
   
    
}

class Demo4
{
    public static void main(String A[])
    {
        Hello obj = new Hello(10,20);
    }
}
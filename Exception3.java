import java.util.Scanner;

class Exception3 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0, Ans = 0;


        try
        {
                System.out.println("Enter first Number");
                No1 = sobj.nextInt();

                System.out.println("Enter Second  Number");
                No2 = sobj.nextInt();

                 Ans=No1/No2;
        }
        catch(ArithmeticException aobj)
        {
            System.out.println("Exception occurred :"+aobj);
        }
        finally
        {
            System.out.println("Inside finally block :");
        }

        System.out.println("Division is : "+Ans);


    }
}
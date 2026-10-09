import java.util.*;

class Selection2
 {
    public static void main(String A[]) {
        int Age = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Age..");
        Age = sobj.nextInt();

        if (Age>=18) 
        {
            System.out.println("Your Allowed Inside... ");
        } 
        else
        {
            System.out.println("Your Not Allowed  Inside... ");
        }

    }
}
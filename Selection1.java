import java.util.*;

class Selection1 {
    public static void main(String A[]) {
        int No = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a Number");
        No = sobj.nextInt();

        if ((No % 2) == 0) 
        {
            System.out.println(No + " is Even Number ");
        } 
        else
        {
            System.out.println(No + " is Odd Number ");
        }

    }
}
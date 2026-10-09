import java.util.Scanner;

class Exception1 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        int No1 = 0, No2 = 0, Ans = 0;

        System.out.println("Enter first Number");
        No1 = sobj.nextInt();

        System.out.println("Enter Second  Number");
        No2 = sobj.nextInt();

        Ans=No1/No2;//exception prone code //excetion yenyachi shakkyata

        System.out.println("Division is : "+Ans);


    }
}
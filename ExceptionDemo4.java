import java.util.Scanner;

class AgeInvalid extends Exception 
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}

class ExceptionDemo4 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
        
        int Age=0;

        System.out.println(" Enter your Age :");
        Age=sobj.nextInt();

        try{
            if(Age<18)
        {
            throw new AgeInvalid("Your are Under Age ");        
        }
        else{
            System.out.println("Welcome to Ullu ");
        }

        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Exception Occured Due To Age ");
        }




    }
}
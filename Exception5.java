import java.util.Scanner;

class Exception5 {
    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);
       
        int arr[]={11,21,51,101,111};
        int index=0;


        try{
                
        System.out.println("Enter the index ");
        index=sobj.nextInt();

        System.out.println("Element is "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Inside catch :");
        }
        System.out.println("End of main  ");

        
    


    }
}
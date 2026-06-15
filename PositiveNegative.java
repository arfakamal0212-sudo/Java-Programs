import java.util.Scanner;
class Number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter Number: ");
        n=sc.nextInt();
        if(n>0)
        {
            System.out.print("Number is positive");
        }
        else if(n<0)
        {
            System.out.print("Number is negative");
        }
        else
        {
            System.out.print("Zero");
        }
    }
}
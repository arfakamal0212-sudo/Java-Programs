import java.util.Scanner;
class Largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.print("A is larger than B");
        }
        else
        {
            System.out.print("B is larger than A");
        }
    }
}
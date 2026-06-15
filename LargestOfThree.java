import java.util.Scanner;
class Largest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a and b and c: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        {
            System.out.print("A is larger");
        }
        else if(b>c)
        {
            System.out.print("B is larger");
        }
        else
        {
            System.out.print("C is larger");
        }
    }
}
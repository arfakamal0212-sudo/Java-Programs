import java.util.Scanner;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.print("Enter Number of Terms: ");
        n=sc.nextInt();
        System.out.print(a + " " + b + " ");
        for(int i=3;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
}
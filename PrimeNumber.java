import java.util.Scanner;
class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,count=0;
        System.out.print("Enter Number: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("Prime Number");
        }
        else
        {
            System.out.print("Not Prime Number");
        }
    }
    
}
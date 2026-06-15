import java.util.Scanner;
class Swap
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp;
        System.out.println("Before Swapping");
        System.out.print("A Value: ");
        a=sc.nextInt();
        System.out.print("B Value: ");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println("A Value: "+ a);
        System.out.println("B Value: "+ b);
    }
}

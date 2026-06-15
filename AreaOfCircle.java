import java.util.Scanner;
class Circle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.print("Enter Radius: ");
        r=sc.nextInt();
        double area=3.14*r*r;
        System.out.print("Area of Circle: "+ area);
    }
}
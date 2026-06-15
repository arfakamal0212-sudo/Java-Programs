import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter A and B: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Choice: ");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Result: "+(a+b));
                break;
            case 2:
                System.out.println("Result: "+(a-b));
                break;
            case 3:
                System.out.println("Result: "+(a*b));
                break;
            case 4:
                System.out.println("Result: "+ (a/b));
                break;
            default:
                System.out.print("Invalid Case");
            
        }
    }
    
}
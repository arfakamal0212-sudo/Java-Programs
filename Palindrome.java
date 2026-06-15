import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num,reverse=0,digit,original;
        System.out.print("Enter Number: ");
        num=sc.nextInt();
        original=num;
        while(num>0)
        {
            digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }
        if(original==reverse)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    }
    
}
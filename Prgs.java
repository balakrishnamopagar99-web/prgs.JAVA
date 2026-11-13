import java.util.*;
public class Prgs
{
    public static void main(String[]args)
    {
        int a,b;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a,b");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        {
            System.out.println("a is big");
        }
        else
        {
            System.out.println("b is big");
        }

        sc.close();
    }
}
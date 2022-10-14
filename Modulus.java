import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        int p,q,r;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        r=p%q;
        System.out.printf("%d",r);
    }
}
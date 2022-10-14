import java.util.Scanner;
class floatingpoints
{
    public static void main(String args[])
    {
        float x,y,z;
        Scanner sc=new Scanner(System.in);
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=x*y;
        System.out.printf("%.2f",z);
    }
}
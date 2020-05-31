import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a/100;
		int c=a%100;
		int d=c/10;
		int e=c%10;
		System.out.print(e);
		System.out.print(d);
		System.out.print(b);
  }
}
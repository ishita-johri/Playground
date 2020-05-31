import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      for(int a=1;a<=n;a=a+1)
      {
        sum=sum+a;
      }
      System.out.println(sum);
	}
}
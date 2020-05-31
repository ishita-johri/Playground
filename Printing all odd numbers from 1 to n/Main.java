import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a;
      int b=(n+1)/2;
      for(int count=1;count<=b;count=count+1)
      {
        a=2*count-1;
        System.out.println(a);
      }
	}
}
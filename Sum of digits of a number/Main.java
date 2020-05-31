import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=n%10;
      int a;
      while(n>=10)
      {
        n=n/10;
        a=n%10;
      sum=sum+a;
    }
      System.out.println(sum);
}
}
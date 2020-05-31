import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=0;
      int b=0;
      int c;
      if(n>100)
      {
      while(n>100)
       {
         n=n/10;
	}
        a=n;
        c=a%10;
        System.out.println(c);
      }
      else
      {
        n=n%10;
        b=n;
        System.out.println(b);
      }
      
    }
}
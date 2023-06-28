Bitwise Operator
//even or odd
public class Main
{
	public static void main(String[] args) {
		
		 int n=11;
		 
		if((n&1)==0){
		    System.out.println("Even");
		}
		else{
		 System.out.println("Odd");
		}
	}
}

//get ith bit is set or not
public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int i=0;
		int c=n&(i<<2);
		if(c==0){
		    System.out.println("0");
		}
		else{
		 System.out.println("1");
		}
	}
}
//set ith bit

public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int i=2;
		 int r=n|(1<<i);
		 System.out.println(r);//14
		
	}
}
//clear ith bit
public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int i=1;
		 int r=n& (~(1<<i));
		 System.out.println(r);//8
		
	}
}
//update ith bit
public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int i=2;
		 int j=1;
		 int r=n& (~(1<<i));
		 int res=j<<i;
		 int f=n|res;
		 System.out.println(f);//14(ith pos change to jth pos)
		
	}
}

//clear last ith bit
public class Main
{
	public static void main(String[] args) {
		
		 int n=15;
		 int i=2;
		 int res=(~0)<<i;
		 int f=n&res;
		 System.out.println(f);//12
		
	}
}
//clear bits from range

public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int i=2;
		 int j=4;
		 
		 int res=(~0)<<(j+1);
		 int b=(1<<i)-1;
		 int result=n&(res|b);
		
		 System.out.println(result);
		
	}
}


//check given number is power of 2

public class Main
{
	public static void main(String[] args) {
		
		 int n=8;
		 
		 if((n&(n-1))==0){
		     System.out.println("TRue");
		 }
		 else{
		     System.out.println("False");
		 }
	}
}
//count set bits(1)'s
public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 
		 int cnt=0;
		 while(n>0){
		     if((n&1)!=0){
		         cnt++;
		     }
		     n=n>>1;
		 }
		 System.out.println(cnt);//2
		
		
	}
}
//Fast Exponentiation code
public class Main
{
	public static void main(String[] args) {
		
		 int n=10;
		 int a=2;
		 int ans=1;
		 while(n>0){
		     if((n&1)!=0){
		         ans*=a;
		     }
		     a=a*a;
		     n=n>>1;
		 }
		System.out.println(ans);//1024(2 to power 10)
		
	}
}

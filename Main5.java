public class Main
{
	public static void main(String[] args) {
		int n=5,m=5;
		int i,j,k;
		for(i=1;i<=n;i++){
		    for(j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    for(k=1;k<=2*(n-i);k++){
		        System.out.print(" ");
		    }
		    for(j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		    
		}
		//2nd half
		for(i=n;i>=1;i--){
		    //star
		    for(j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    //spaces
		    for(k=1;k<=2*(n-i);k++){
		        System.out.print(" ");
		    }
		    //star
		    for(j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		    
		}
	}
}

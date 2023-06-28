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
// Solid Rhombus
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=1;i<=n;i++){
		    for(j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=n;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
//hollow rhombus pattern
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=1;i<=n;i++){
		    for(j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=n;k++){
			if(k==1||j==1|j==n|k==n){
		        System.out.print("*");
			}
			else{
			    System.out.print(" ");
			}
		    }
		    System.out.println();
		}
	}
}


//diamond pattern
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=1;i<=n;i++){
		    for(j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		   for(int k=1;k<=(2*i)-1;k++){
		       System.out.print("*");
		   }
		    
		    System.out.println();
		}
		for(i=n;i>=1;i--){
		    for(j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		   for(int k=1;k<=(2*i)-1;k++){
		       System.out.print("*");
		   }
		    
		    System.out.println();
		}
		
	}
}
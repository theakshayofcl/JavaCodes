//Pyramid Triangle = Decreasing Triangle + 2 Increasing Triangle
// Note : We should eliminate one column in first Increasing Triangle to get proper pyramid

public class Main
{
	public static void main(String[] args) {
	    int n = 5;
		for (int i =1;i<=n;i++){
		    
		    for (int j= i;j<=n;j++){
		        System.out.print(" ");
		    }
		    
		    for (int k=1;k<i;k++){
		        System.out.print("*");
		    }
		    
		    for (int l=1;l<=i;l++){
		        System.out.print("*");
		    }
		    
		    
		    System.out.println();
		}
	}
}

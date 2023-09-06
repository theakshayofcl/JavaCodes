//Diamond Triangle = UpwardPyramid Triangle + DownwardPyramid Triangle

// Note : We should eliminate one row in first Increasing Triangle to get proper Diamond

public class Main
{
	public static void main(String[] args) {
	    int n = 5;
	    
	     //Triangle 1  
		for (int i =1;i<n;i++){
		 
		  
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
		
		
	       //Triangle2
		 for (int i =1;i<=n;i++){

		    for (int m= 1;m<=i;m++){
		        System.out.print(" ");
		    }
		    
		    for (int o =i;o<n;o++){
		        System.out.print("*");
		    }
		    
		    for (int p=i;p<=n;p++){
		        System.out.print("*");
		    }
		    
		    System.out.println();
		    
		}
	}
}

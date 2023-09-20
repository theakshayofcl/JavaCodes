
public class Main
{
	public static void main(String[] args) {
	
	int n = 5;
	
//Set 1
//i for row and j for columns
	
	for (int i = 1;i<n;i++){

    for (int j = 1;j<=i;j++){
        
        System.out.print("*");
        
    }

    for (int j = i;j<n;j++){
        
        System.out.print(" ");
        
    }

    for (int j = i;j<n;j++){
        
        System.out.print(" ");
        
    }

    for (int j = 1;j<=i;j++){
        
        System.out.print("*");
        
    }

    System.out.println();
	    
	}
	
	
//Set 2
//i for row and j for columns	
	
	for (int i = 1;i<=n;i++){

    for (int j = i;j<=n;j++){
        
        System.out.print("*");
        
    }

    for (int j = 1;j<i;j++){
        
        System.out.print(" ");
        
    }

    for (int j = 1;j<i;j++){
        
        System.out.print(" ");
        
    }

    for (int j = i;j<=n;j++){
        
        System.out.print("*");
        
    }

    System.out.println();
	    
	}
	
	}
}

public class Main{
    public static void main (String [] args){
        
    int n = 153;
    int temp;
    int armstrong=0;
    int original=n;
    
    while(n>0){
        
        temp = n%10;
        temp = temp*temp*temp;
        armstrong = armstrong + temp;
        n = n/10;
        
    } 
        
    if (armstrong==original){
        System.out.println("its an Armstrong");
    }
    else{
        System.out.println("its not an Armstrong");
    }
    
    
    }   
}
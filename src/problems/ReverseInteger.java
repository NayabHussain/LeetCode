package problems;

public class ReverseInteger {
	
	//
	
	public static void main(String[] args) {
		
		int x=-123;
		
		int y= reverseInteger(x);
		 
		 System.out.println("after reverse"+y);
		
	}

	private static int reverseInteger(int x) {
		
		
		int res = 0,rem;
	        if(x==0){
	            return 0;
	        }
	        
	       while(x!=0){
	           rem=x%10;
	           x=x/10;
	           res= (res*10)+rem;
	       }
	       if(x <0) {
	    	   res = (-1)*res;
	       }
	       
		return res;
	}

}

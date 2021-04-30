package problems;

public class AllzeroLeft {

	public static void main(String[] args) {

		int[] nums1 = new int[] { 0, 0, 2, 4, 0, 7, 8 };

		int count = 0;
		int[] resultArray = new int[nums1.length];

		//adding zeroes
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == 0) {
				
				resultArray[i]=0;
			//	System.err.println(resultArray[zeroCount]);
				count++;
			} 
		}
      
		//adding non zeroes
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] != 0) {
				
				resultArray[count]=nums1[i];
				count++;
			//	System.err.println(resultArray[zeroCount-1]);
				
			} 
		}

		
		//printing all
		for (int i = 0; i < nums1.length; i++) {
			System.err.println(resultArray[i]);
		}
	}

}

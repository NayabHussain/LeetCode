package problems;

import java.util.Arrays;

public class FindMedianSortedArrays {

//	Input: nums1 = [1,3], nums2 = [2]
//			Output: 2.00000
//			Explanation: merged array = [1,2,3] and median is 2.

//	Input: nums1 = [1,2], nums2 = [3,4]
//			Output: 2.50000
//			Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

	public static void main(String[] args) {

		int[] nums1 = new int[] { 1, 2 };
		int[] nums2 = new int[] { 3,4};

		System.out.println("median of the two arrays is" + findMedianSortedArrays(nums1, nums2));

	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 1;
		int mergedArraySize = nums1.length + nums2.length;

		int[] mergedArray = new int[mergedArraySize];

		if (nums1.length == 0) {
			mergedArray = nums2;
		}

		if (nums2.length == 0) {
			mergedArray = nums1;
		}

		if (nums1.length != 0 && nums2.length != 0) {

			for (int i = 0; i < nums1.length; i++) {
				mergedArray[i] = nums1[i];
			}

			for (int i = 0; i < nums2.length; i++) {

				mergedArray[nums1.length + i] = nums2[i];
			}

		}
		Arrays.sort(mergedArray);

		int mid = 0;
		if (mergedArray.length % 2 == 1) {
			mid = mergedArray.length / 2 + 1;
			return mergedArray[mid-1]/median;
		}
		
		if (mergedArray.length % 2 == 0) {
			mid = mergedArray.length / 2 ;
			return ((mergedArray[mid-1]+mergedArray[mid])/2.0)/median;
		}

		return median;
	}
}

package medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class MedianofTwoSortedArrays {
	public static void main(String[] args) {
		int[] nums1 = { 0,0 };
		int[] nums2 = { 0,0};
		System.out.println("donus: " + findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		List<Double> list = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			list.add((double) nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {
			list.add((double) nums2[i]);
		}
		Collections.sort(list);

		int size = list.size();
		int middle = size / 2;
		if ((size % 2) == 0) // Length of list is even
		{
			double res = (list.get(middle - 1) + list.get(middle)) / 2;
			return res;
		} else // Length of list is odd
		{
			return (double) list.get(middle);
		}

	}

}

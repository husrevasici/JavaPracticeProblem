package hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindMedianInAStream {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("while: ");
		int t = scan.nextInt();

		int n;

		while (t-- > 0) {
			System.out.print("kaç sayi istenecek: ");
			n = scan.nextInt();
			Solution obj = new Solution();
			for (int i = 1; i <= n; i++) {
				System.out.print("sayiniz: ");
				int x = scan.nextInt();
				obj.insertHeap(x);
				System.out.println((int) Math.floor(obj.getMedian()));
			}
		}

	}
}

class Solution {

	static List<Integer> list = new ArrayList<Integer>();
	static double median;

	public static void insertHeap(int x) {
		list.add(x);
		balanceHeaps();
	}

	public static void balanceHeaps() {
		Collections.sort(list);
		if (list.size() % 2 == 1) {
			median = list.get((list.size() - 1) / 2);
		} else {
			median = ((list.get(list.size() / 2)) + (list.get((list.size() / 2) - 1))) / 2;
		}
	}

	public static double getMedian() {

		return median;
	}

}

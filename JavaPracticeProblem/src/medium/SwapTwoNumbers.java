package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			Solution solutionObject = new Solution();
			List<Integer> ans = solutionObject.get(a, b);
			System.out.println(ans.get(0) + " " + ans.get(1));

		}
	}

}

class Solution {
	static List<Integer> get(int a, int b) {

		List<Integer> list = new ArrayList<>();
		list.add(b);
		list.add(a);
		return list;

	}
}

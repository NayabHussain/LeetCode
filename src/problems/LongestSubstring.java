package problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {

		String str = "abcabbe";

		System.out.println("Longest substring length is " + lengthOfLongestSubstring(str));

	}

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length();
		int ans = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j <= n; j++)
				if (allUnique(s, i, j))
					ans = Math.max(ans, j - i);
		return ans;
	}

	public static boolean allUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return true;

	}

}

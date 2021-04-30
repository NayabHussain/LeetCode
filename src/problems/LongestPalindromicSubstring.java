package problems;

public class LongestPalindromicSubstring {

	// Input String s = "babad";

	// Output: "bab"
	// Note: "aba" is also a valid answer.

	public static void main(String[] args) {

		String s = "babad";

		String output = null;

		int previoislen = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = i+1; j <= s.length(); j++) {
				
				if (isPalindrome(s.substring(i, j), 0, s.substring(i, j).length()-1)) {

					if (s.substring(i, j).length() > previoislen) {
						previoislen = s.substring(i, j).length();
						output = s.substring(i, j);
					}

				}

			}

		}

		System.out.println("LongestPalindromicSubstring " + output);

	}

	public static boolean isPalindrome(String s, int start, int end) {
		boolean ispalindrome = true;

		while (start <= end) {
			if (s.charAt(start) != s.charAt(end)) {
				ispalindrome = false;
				break;
			}

			start++;
			end--;
		}

		return ispalindrome;

	}
}

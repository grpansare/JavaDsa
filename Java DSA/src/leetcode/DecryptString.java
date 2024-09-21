package leetcode;

public class DecryptString {
    public static String freqAlphabets(String s) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // If there is a '#' at position i+2, it means the current character is in the form of "10#" to "26#"
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                // Convert the substring s[i:i+2] into an integer and map it to the corresponding character
                int num = Integer.parseInt(s.substring(i, i + 2));
                System.out.println(num);
                result.append((char) ('a' + num - 1));
                i += 3; // Move past the processed sequence
            } else {
                // Otherwise, it is a single character '1' to '9'
                int num = s.charAt(i) - '0';
                result.append((char) ('a' + num - 1));
                i += 1; // Move to the next character
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {
		 freqAlphabets("10#11#12");
	}
}


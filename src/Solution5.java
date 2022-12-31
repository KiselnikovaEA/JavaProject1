public class Solution5 {
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;
        //s = s.toLowerCase();
        while (left <= right) {
            while (left <= right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left <= right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (left > right) {
                break;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                right--;
                left++;
            }
        }
        return true;
    }
}
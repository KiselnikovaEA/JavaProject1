public class Main {
    public static void main(String[] args) {
        String s = Solution.mergeAlternately("abc", "def");
        System.out.println("Task1: " + s);
        int h = Solution2.removeElement(new int[]{3, 2, 2, 3}, 3);
        System.out.println("Task2: " + h);
        Solution3.merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        String test = Solution4.reverseWords("the sky is blue");
        System.out.println("Task4: " + test);
        boolean b = Solution5.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("Task5: " + b);
    }
}

public class Solution4 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        // удаление пробелов в начале строки
        int start = 0;
        while (sb.charAt(start) == ' ') {
            sb.deleteCharAt(start);
        }
        // удаление пробелов в конце строки
        int end = sb.length() - 1;
        while (sb.charAt(end) == ' ') {
            sb.deleteCharAt(end);
            end--;
        }
        start = 0;
        end = 0;
        // переворачивание каждого отдельного слова в строке
        while (end < sb.length()) {
            end++;
            if (end == sb.length()) {
                wordReverse(sb, start, end - 1);
            } else if (sb.charAt(end) == ' ') {
                wordReverse(sb, start, end - 1);
                start = end + 1;
            }

        }
        // удаление лишних пробелов в середине предложения
        start = 1;
        while (start < sb.length()) {
            if (sb.charAt(start) == ' ' && sb.charAt(start - 1) == ' ') {
                sb.deleteCharAt(start);
            } else {
                start++;
            }
        }
        s = sb.reverse().toString();
        return s;

    }

    public static void wordReverse(StringBuilder s, int start, int end) {
        while (start < end) {
            char temp = s.charAt(end);
            s.setCharAt(end--, s.charAt(start));
            s.setCharAt(start++, temp);
        }
    }
}
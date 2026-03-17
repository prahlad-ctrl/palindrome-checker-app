public class palindrome {
    private static void palindromeUsingRecursion(String text) {
        boolean result = isPalindromeRecursive(text, 0, text.length() - 1);
        if (result) {
            System.out.println("UC9 Result: \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("UC9 Result: \"" + text + "\" is NOT a Palindrome.");
        }
        System.out.println();
    }
    private static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
}
}
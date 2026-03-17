public class palindrome {
    private static void palindromeIgnoreCaseAndSpaces(String text) {

        String normalized = text.toLowerCase();
        normalized = normalized.replaceAll("\\s+", "");

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("UC10 Result: \"" + text + "\" is a Palindrome (Ignoring case & spaces).");
        } else {
            System.out.println("UC10 Result: \"" + text + "\" is NOT a Palindrome (Ignoring case & spaces).");
        }

        System.out.println();
    }
}
}
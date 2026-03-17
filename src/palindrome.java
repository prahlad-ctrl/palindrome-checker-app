public class palindrome {
    private static void palindromeUsingService(String text) {

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(text);

        if (result)
            System.out.println("UC11 Result (OOP Service): \"" + text + "\" is a Palindrome.");
        else
            System.out.println("UC11 Result (OOP Service): \"" + text + "\" is NOT a Palindrome.");

        System.out.println();
    }

    // Encapsulated Service Class
    static class PalindromeService {

        public boolean checkPalindrome(String text) {

            char[] arr = text.toCharArray();
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                if (arr[start] != arr[end])
                    return false;
                start++;
                end--;
            }
            return true;
        }
    }
}
}
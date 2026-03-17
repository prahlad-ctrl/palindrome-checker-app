public class palindrome {
    private static void palindromeUsingStrategyPattern(String text) {

        PalindromeStrategy strategy;

        // Choose strategy dynamically
        strategy = new StackStrategy();
        boolean result1 = strategy.check(text);

        System.out.println("UC12 Result (Stack Strategy): \"" + text + "\" → " + result1);

        strategy = new DequeStrategy();
        boolean result2 = strategy.check(text);

        System.out.println("UC12 Result (Deque Strategy): \"" + text + "\" → " + result2);

        System.out.println();
    }

    // Strategy Interface
    interface PalindromeStrategy {
        boolean check(String text);
    }

    // Stack Strategy Implementation
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String text) {

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < text.length(); i++)
                stack.push(text.charAt(i));

            for (int i = 0; i < text.length(); i++)
                if (text.charAt(i) != stack.pop())
                    return false;

            return true;
        }
    }

    // Deque Strategy Implementation
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String text) {

            Deque<Character> deque = new ArrayDeque<>();
            for (int i = 0; i < text.length(); i++)
                deque.addLast(text.charAt(i));

            while (deque.size() > 1)
                if (deque.removeFirst() != deque.removeLast())
                    return false;

            return true;
        }
    }
}
}
public class palindrome {
    private static void performanceComparison(String text) {

        System.out.println("===== UC13: Performance Comparison =====");

        long start, end;

        // Reverse Loop
        start = System.nanoTime();
        palindromeUsingReverse(text);
        end = System.nanoTime();
        System.out.println("Reverse Loop Time: " + (end - start) + " ns");

        // Char Array
        start = System.nanoTime();
        palindromeUsingCharArray(text);
        end = System.nanoTime();
        System.out.println("Char Array Time: " + (end - start) + " ns");

        // Stack
        start = System.nanoTime();
        palindromeUsingStack(text);
        end = System.nanoTime();
        System.out.println("Stack Time: " + (end - start) + " ns");

        System.out.println("=========================================\n");
    }
}
}
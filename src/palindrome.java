public class palindrome {
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
        }
    }

    private static void palindromeUsingLinkedList(String text) {

        Node head = createLinkedList(text);

        boolean result = isPalindromeLinkedList(head);

        printResult("UC8", text, result);
    }

    private static Node createLinkedList(String text) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < text.length(); i++) {
            Node newNode = new Node(text.charAt(i));

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    private static boolean isPalindromeLinkedList(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    private static Node reverseList(Node head) {

        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    // ================= Common Result Printer =================
    private static void printResult(String uc, String text, boolean isPalindrome) {

        if (isPalindrome) {
            System.out.println(uc + " Result: \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println(uc + " Result: \"" + text + "\" is NOT a Palindrome.");
        }
    }
}
}
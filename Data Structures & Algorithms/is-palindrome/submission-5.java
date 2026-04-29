class Solution {
    public boolean isPalindrome(String s) {
        // 팰린드롬: same forward and backward + case-insensitive and ignores all
        // non-alphanumeric characters.
        // Alphanumeric: A-Z, a-z and numbers (0-9)
        s = s.toUpperCase();
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i)))
                deque.add(s.charAt(i));
        }
        while (deque.size() > 1) {
            if (deque.pollLast() != deque.poll()) // 앞, 뒤에서 꺼내서 비교
                return false;
        }
        return true;
    }
}

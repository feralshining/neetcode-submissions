/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        // head는 사이클이 존재하는 linkedlist인가?
        // Time Complexity = O(n)
        // Space Complexity = O(1)

        HashSet<Integer> hSet = new HashSet<>(); // 사이클 확인용

        if (head == null)
            return false;

        // 모든 데이터를 HashSet에 박는 로직
        while (head.next != null) {
            if (hSet.contains(head.val))
                return true;
            hSet.add(head.val);
            head = head.next;
        }

        return false;
    }
}

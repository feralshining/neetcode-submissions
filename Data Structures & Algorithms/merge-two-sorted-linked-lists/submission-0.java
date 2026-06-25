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
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
                    // LinkedList를 각각 정렬해서 하나로 합치기

        // LinkedList 값을 다 빼서 정렬하는 로직
        ArrayList<Integer> tmpList = new ArrayList<>();
        while (list1 != null) {
            tmpList.add(list1.val);
            list1 = list1.next; // 1 -> 2 -> 4의 형태에서 1의 값만 빼고 2 -> 4만 남기기 가능
        }

        while (list2 != null) {
            tmpList.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(tmpList);

        for (Integer i : tmpList) {
            System.out.println(i);
        }

        // 머지 알고리즘 (새로운 링크드리스트 생성)
        // primitive는 복사이지만, Object에 대해선 항상 참조임.
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < tmpList.size(); i++) {
            current.next = new ListNode(tmpList.get(i)); // {1}
            current = current.next;
        }

        return dummy.next;
        }
}   
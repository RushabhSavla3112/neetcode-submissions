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
        HashSet<ListNode> hs = new HashSet<>();
        ListNode lst = head;
        while (lst != null) {
            if(hs.contains(lst))return true;
            hs.add(lst);
            lst = lst.next;
        }
        return false;
    }
}
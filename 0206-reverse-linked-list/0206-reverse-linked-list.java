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
    public ListNode reverseList(ListNode head) {
        if (head == null) { //0
            return null;
        }
        if (head.next == null) {//1
            return head;
        }

        ListNode curHead = head;// >1
        Stack <Integer> s = new Stack<>();
        while ( curHead != null){
            s.push(curHead.val);
            curHead = curHead.next;
        }

        ListNode curr = new ListNode(s.pop());
        ListNode newHead = curr;
        while(!s.isEmpty()){
            curr.next = new ListNode(s.pop());
            curr = curr.next;
        }
        return newHead;
    }
}
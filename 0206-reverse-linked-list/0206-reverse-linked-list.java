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
        if(head == null || head.next == null){
            return head;
        }

        Stack<Integer> st = new Stack<>();
        ListNode currHead = head;
        while(currHead != null){
            st.push(currHead.val);
            currHead = currHead.next;
        }

        ListNode curr = new ListNode(st.pop());
        ListNode newHead = curr;
        while(!st.isEmpty()){
            curr.next = new ListNode(st.pop());
            curr = curr.next;
        }

        return newHead;
    }
}
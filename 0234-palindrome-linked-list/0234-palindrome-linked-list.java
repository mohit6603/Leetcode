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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //second half find
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse
        ListNode newHead = reverse(slow.next);

        //compare 
        ListNode first = head;
        ListNode second = newHead;
        while(second != null){
            if(first.val != second.val){
                reverse(newHead);
                return false;
            }
            first = first.next;
            second = second.next;

        }
        reverse(newHead);
        return true;
    }
}
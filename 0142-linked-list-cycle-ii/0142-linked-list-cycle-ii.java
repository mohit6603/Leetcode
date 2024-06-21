/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;

        //detect cycle
        boolean ans = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                ans = true;
                break;
            }
        }
        if(ans == false){
            return null;
        }
        else{
            slow = head;
        }
        if(slow == fast){
            return head;
        }
        else{
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}
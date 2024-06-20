/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = length(headA);
        int l2 = length(headB);
        ListNode p1;
        ListNode p2;
        int d = 0;
        if(l1>l2){
            d = l1-l2;
            p1 = headA;
            p2 = headB;
        }else{
            d = l2-l1;
            p1 = headB;
            p2 = headA;
        }

        while(d > 0){
            if(p1 == null) return null;
            p1 = p1.next;
            d--;
        }

        while(p1 != null && p2 != null){
            if(p1 == p2) return p1;
            p1 = p1.next;
            p2 = p2.next;
        }
        return null;
    }

    public int length(ListNode head){
        int i = 0;
        while(head != null){
            i++;
            head = head.next;
        }
        return i;
    }
}
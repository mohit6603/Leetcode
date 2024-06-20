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
    public boolean isPalindrome(ListNode head) {
        List<Integer> al = new ArrayList<>();
        while(head != null){
            al.add(head.val);
            head = head.next;
        }

        int lp = 0, rp = al.size()-1;
        while(lp < rp){
            if(al.get(lp) != al.get(rp)){
                return false;
            }
            else{
                lp++;
                rp--;
            }
        }
        return true;
    }
}
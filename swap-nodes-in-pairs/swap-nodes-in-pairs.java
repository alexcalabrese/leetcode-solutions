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
    public ListNode swapPairs(ListNode head) {  
        return reverse(head);
    }
    
    private ListNode reverse(ListNode head){
        // Base case
        if(head == null || head.next == null) return head; 
        
        // Reverse
        ListNode tmp = head;
        
        ListNode succ = head.next.next != null ? head.next.next : null;
        
        head = head.next;

        head.next = tmp;
        tmp.next = succ;
        
        head.next.next = reverse(head.next.next);
        
        return head;
    }
}
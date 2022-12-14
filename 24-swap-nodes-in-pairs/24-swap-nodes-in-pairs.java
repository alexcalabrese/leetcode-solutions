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
        
        // tmp = 1
        ListNode tmp = head;
        
        // succ = 3
        ListNode succ = head.next.next != null ? head.next.next : null;
        
        // head = 2
        head = head.next;

        // 2 -> 1
        head.next = tmp;
        
        // 1 -> 3
        tmp.next = succ;
        
        // 1 -> reverse(3) = 4 -> 3
        head.next.next = reverse(head.next.next);
        
        return head;
    }
}
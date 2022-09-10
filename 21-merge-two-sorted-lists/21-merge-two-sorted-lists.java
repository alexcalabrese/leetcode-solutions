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
        ListNode dummy = new ListNode();
        ListNode curr = new ListNode();
        dummy.next = curr;
        
        while(list1 != null || list2 != null){
            if(list1 != null && list2 != null){
                if(list1.val < list2.val){
                    curr.next = list1;
                    list1 = list1.next;
                } else {
                    curr.next = list2;
                    list2 = list2.next;
                }
            } else {            
                if(list1 == null) curr.next = list2;
                else if(list2 == null) curr.next = list1;
                
                if(list1 != null) list1 = list1.next;
                if(list2 != null) list2 = list2.next;
            }
            
            curr = curr.next;
        }
        
        return dummy.next.next;
    }
}
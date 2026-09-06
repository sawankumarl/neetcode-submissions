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
    public void reorderList(ListNode head) {
    
    ListNode current=head;
    //find middle of Linkedlist;
    ListNode middleNode = findMiddle(current);
    ListNode reverseNode = reversedList(middleNode);
    ListNode firstNode=head;
    merge(firstNode,reverseNode);
    }


    public ListNode findMiddle(ListNode current){

        ListNode slowptr=current;
        ListNode fastptr=current;

        while(fastptr.next !=null && fastptr.next.next !=null){
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
        }
        ListNode middle  = slowptr.next;
        slowptr.next = null;
        return middle;

    }

    public ListNode reversedList(ListNode current){
        ListNode nextNode=null;
        ListNode prev=null;

        while(current!=null){
            nextNode = current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2) {
    while (l1 != null && l2 != null) {
        ListNode l1next = l1.next;
        ListNode l2next = l2.next;

        l1.next = l2;   // link l1 → l2
        if (l1next == null) break; // important: avoid null pointer at end
        l2.next = l1next; // link l2 → l1next

        l1 = l1next;   // move l1 forward
        l2 = l2next;   // move l2 forward
    }
}

}

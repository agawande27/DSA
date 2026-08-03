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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        cnt=cnt/2;
        temp=head;
        while(temp!=null){
             cnt--;
        if(cnt==0){
            temp.next=temp.next.next;
            break;
        }
        temp=temp.next;
       
        }
        return head;
    }
}
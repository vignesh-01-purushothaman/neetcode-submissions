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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode maja = dummy;

        int carry = 0;

        while(curr1 != null || curr2 != null){

            int val1 = (curr1 != null) ? curr1.val : 0;
            int val2 = (curr2 != null) ? curr2.val : 0;

            int tempSum = val1 + val2 + carry;

            maja.next = new ListNode(tempSum % 10);
            maja = maja.next;

            carry = tempSum / 10;

            if(curr1 != null) curr1 = curr1.next;
            if(curr2 != null) curr2 = curr2.next;
        }

        if(carry > 0){
            maja.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
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
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        boolean isthere=true;
        HashSet<ListNode>set=new HashSet<>();

        while(!set.contains(temp)&&temp.next!=null){
            set.add(temp);
            temp=temp.next;
        }

        if(temp.next!=null){
            isthere=true;
        }
        else{
            isthere=false;
        }

        return isthere;

        

        
    }
}

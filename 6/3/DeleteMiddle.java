class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode prevOfSlow = null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            prevOfSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prevOfSlow.next = slow.next;
        return head;
    }
}
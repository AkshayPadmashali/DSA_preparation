class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode middleHead = reverseLinkedList(slow);

        while(head != null && middleHead != null){
            if(head.val != middleHead.val){
                return false;
            }
            head = head.next;
            middleHead = middleHead.next;
        }

        return true;
    }

    public ListNode reverseLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
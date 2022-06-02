package addtwonumbers;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {
    public ListNode add(ListNode l1, ListNode l2, int rem){
        if (l1 == null && l2 == null && rem == 0) return null;
        int left = (l1 != null) ? l1.val : 0;
        int right = (l2 != null) ? l2.val : 0;
        int temp = left + right + rem;
        ListNode current = new ListNode();
        current.val = temp % 10;
        rem = temp / 10;
        ListNode l1Next = (l1 == null) ? l1 : l1.next;
        ListNode l2Next = (l2 == null) ? l2 : l2.next;
        current.next = add(l1Next, l2Next, rem);
        return current;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }
}

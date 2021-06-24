public class Q24 {
    public ListNode swapPairs(ListNode head) {
        ListNode start=new ListNode(0,head);
        ListNode current=start;
        while(current.next!=null&&current.next.next!=null){
            ListNode first=current.next;
            ListNode second=current.next.next;
            first.next=second.next;
            current.next=second;
            current.next.next=first;
            current=current.next.next;
        }
        return start.next;
    }
}

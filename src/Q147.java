import java.util.List;

public class Q147 {
    public ListNode insertionSortList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode start=new ListNode(0);
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            ListNode pre=start;
            while(pre.next!=null&&pre.next.val<current.val){
                pre=pre.next;
            }
            current.next=pre.next;
            pre.next=current;
            current=next;
        }
        return start.next;
    }
}

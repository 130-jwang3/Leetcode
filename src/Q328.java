public class Q328 {
    /*
    have two iteration
    1 iterate all the odd number node and put them one next to each other
    the other 1 iterate all the even number node and put them next to each other
    then at the end put the even list next to odd list to make the whole list otgether
     */
    public ListNode oddEvenList(ListNode head) {
        if(head!=null) {
            ListNode odd = head, even = head.next, evenHead = even;
            while (even != null && even.next != null) {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Q622{
    class MyCircularQueue {
        int maxSize, size = 0;
        ListNode head = null, tail = null;
        /** Initialize data structure here. Set the size of the list to be k. */
        public MyCircularQueue(int k) {
            maxSize = k;
        }
        /** Insert an element into the circular queue at the tail. Return true if the operation is successful. */
        public boolean enQueue(int val) {
            if (isFull()) return false;
            ListNode newNode = new ListNode(val, null);
            if (isEmpty()) head = tail = newNode;
            else {
                tail.next = newNode;
                tail = tail.next;
            }
            size++;
            return true;
        }
        /** Delete an element from the circular queue head. Return true if the operation is successful. */
        public boolean deQueue() {
            if (isEmpty()) return false;
            head = head.next;
            size--;
            return true;
        }
        /** Get the front item from the queue. */
        public int Front() {
            return isEmpty() ? -1 : head.val;
        }
        /** Get the last item from the queue. */
        public int Rear() {
            return isEmpty() ? -1 : tail.val;
        }
        /** Checks whether the circular queue is empty or not. */
        public boolean isEmpty() {
            return size == 0;
        }
        /** Checks whether the circular queue is full or not. */
        public boolean isFull() {
            return size == maxSize;
        }
    }
}

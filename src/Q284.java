import java.util.Iterator;

public class Q284 {
    class PeekingIterator implements Iterator<Integer> {
        private Integer next=null;
        private Iterator<Integer> ite;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            ite=iterator;
            if(ite.hasNext()){
                next=ite.next();
            }
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer result=next;
            if(ite.hasNext()){
                next=ite.next();
            }else{
                next=null;
            }
            return result;
        }

        @Override
        public boolean hasNext() {
            return next!=null;
        }
    }
}

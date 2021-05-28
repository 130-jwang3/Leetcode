import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


public class Q341 {
    public interface NestedInteger {
        public boolean isInteger();
        public Integer getInteger();
        public List<NestedInteger> getList();
    }
    public class NestedIterator implements Iterator<Integer> {
        private List<Integer> elements = new ArrayList<>();
        int index = 0;
        public NestedIterator(List<NestedInteger> nestedList) {
            init(nestedList);
        }
        private void init(List<NestedInteger> nestedList) {
            if (nestedList.isEmpty())
                return;
            for (NestedInteger n : nestedList) {
                if (!n.isInteger()) {
                    init(n.getList());
                } else
                    elements.add(n.getInteger());
            }
        }
        @Override
        public Integer next() {
            return elements.get(index++);
        }
        @Override
        public boolean hasNext() {
            if (index < this.elements.size())
                return true;
            else
                return false;
        }
    }

}

import java.util.*;

public class Q380 {
    class RandomizedSet {
        List<Integer> container;
        Map<Integer,Integer> map;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            container=new ArrayList<Integer>();
            map=new HashMap<>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            }else{
                map.put(val,container.size());
                container.add(container.size(),val);
                return true;
            }
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(!map.containsKey(val)){
                return false;
            }else{
                int last = map.remove(val);
                if(last != container.size() - 1) {
                    int first = container.get(container.size() - 1);
                    map.put(first, last);
                    container.set(last, first);
                }
                container.remove(container.size() - 1);
                return true;
            }
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return container.get((int)(Math.random()*(container.size())));
        }
    }
}

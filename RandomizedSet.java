import java.util.*;

class RandomizedSet {
    Set<Integer> set;

    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }
        set.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list);
        return list.get(0);
    }
}
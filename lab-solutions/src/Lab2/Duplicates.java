package Lab2;

import java.util.*;

class Duplicates {
    public static void removeDuplicatesAndSort(int[] a) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        LinkedHashSet<Integer> sortedSet = new LinkedHashSet<>(list);
        System.out.println(sortedSet);
    }


    public static void main(String[] args) {
        int a[] = {5, 2, 6, 8, 6, 7, 5, 2, 8};
        removeDuplicatesAndSort(a);
    }
}

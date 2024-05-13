package n1exercici2;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(13);
        list1.add(23);
        list1.add(32);

        for (int number : list1) {
            System.out.println(number);
        }

        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> list1Iterator = list1.listIterator(list1.size());

        while(list1Iterator.hasPrevious()) {
            list2.add(list1Iterator.previous());
        }

        for (int number : list2) {
            System.out.println(number);
        }
    }
}

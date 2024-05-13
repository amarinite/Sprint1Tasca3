package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<Month>();

        Month january = new Month("january");
        Month february = new Month("february");
        Month march = new Month("march");
        Month april = new Month("april");
        Month may = new Month("may");
        Month june = new Month("june");
        Month july = new Month("july");
        Month august = new Month("august");
        Month september = new Month("september");
        Month october = new Month("october");
        Month november = new Month("november");
        Month december = new Month("december");

        months.add(january);
        months.add(february);
        months.add(march);
        months.add(april);
        months.add(may);
        months.add(june);
        months.add(july);
        months.add(september);
        months.add(october);
        months.add(november);
        months.add(december);

        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println();

        months.add(7, august);
        for (Month month : months) {
            System.out.println(month.getName());
        }
        System.out.println();

        months.add(december);
        HashSet<Month> monthsHashSet = new HashSet<>(months);

        for (Month month : monthsHashSet) {
            System.out.println(month.getName());
        }
        System.out.println();
    }
}
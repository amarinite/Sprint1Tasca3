package n2exercici2;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        if(r1.getName().equalsIgnoreCase(r2.getName())) {
            return r2.getPoints() - r1.getPoints();
        } else {
            return r1.getName().compareTo(r2.getName());
        }
    }
}

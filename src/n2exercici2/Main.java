package n2exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant("Fifa", 8));
        restaurants.add(new Restaurant("Pipa", 5));
        restaurants.add(new Restaurant("Pipa", 7));
        restaurants.add(new Restaurant("Mac", 3));

        restaurants.sort(new RestaurantComparator());

        for(Restaurant res : restaurants) {
            System.out.println("Restaurant: " + res.getName() + ", Points: " + res.getPoints());
        }
    }
}


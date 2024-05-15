package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurantsSet = new HashSet<Restaurant>();

        addRestaurant(new Restaurant("pap", 3), restaurantsSet);
        addRestaurant(new Restaurant("pap", 3), restaurantsSet);
        addRestaurant(new Restaurant("pip", 3), restaurantsSet);
        addRestaurant(new Restaurant("pip", 5), restaurantsSet);

        for(Restaurant res : restaurantsSet) {
            System.out.println("Restaurant: " + res.getName() + ", Points: " + res.getPoints());
        }
    }

    public static void addRestaurant(Restaurant restaurant, HashSet<Restaurant> restaurantsSet) {
        boolean contains = false;
        for(Restaurant res : restaurantsSet) {
            if(restaurant.isEqual(res)) {
               contains = true;
            }
        }
        if (!contains) {
            restaurantsSet.add(restaurant);
        }
    }
}

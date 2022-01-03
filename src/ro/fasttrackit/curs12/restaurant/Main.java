package ro.fasttrackit.curs12.restaurant;

import java.util.List;
import static ro.fasttrackit.curs12.restaurant.RestaurantType.*;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
                new Restaurant("Spoon", "Oradea", MEDITERANEEAN, 4),
                new Restaurant("Marty", "Oradea", FUSION, 3),
                new Restaurant("Pizza Hut", "Cluj", GREEK, 2),
                new Restaurant("Gospodina", "Iasi", ROMANIAN, 2)

        ));     

        System.out.println(restaurantService.getRestaurantsOfType(FUSION));
        System.out.println(restaurantService.getRestaurantsOfType(null));

        System.out.println(restaurantService.mapNameToCity());
        System.out.println(restaurantService.mapNametoType());
        System.out.println(restaurantService.mapCityToRestaurants());
    }
}

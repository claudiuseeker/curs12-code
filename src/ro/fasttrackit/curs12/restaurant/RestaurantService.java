package ro.fasttrackit.curs12.restaurant;

import java.util.*;

public class RestaurantService {

    private final List<Restaurant> restaurants;

    public RestaurantService(Collection<Restaurant> restaurants){
        this.restaurants = restaurants == null
                ? new ArrayList<>()
                : new ArrayList<>(restaurants);
    }

    public List<Restaurant> getRestaurantsOfType(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();

        for (Restaurant restaurant : restaurants){
            if(restaurant.getType() == type){
                result.add(restaurant);
            }
        }
        return result;
    }

    public Map<String, String> mapNameToCity(){
        Map<String, String> result = new HashMap<>();

        for (Restaurant restaurant: restaurants){
            result.put(restaurant.getName(),restaurant.getCity());
        }
        return result;
    }

    public Map<String, RestaurantType> mapNametoType(){
        Map<String, RestaurantType> result  = new HashMap<>();

        for (Restaurant restaurant: restaurants){
            result.put(restaurant.getName(), restaurant.getType());
        }
        return result;
    }

    public Map<String, List<Restaurant>> mapCityToRestaurants(){
        Map<String, List<Restaurant>> result = new HashMap<>();

        for (Restaurant restaurant: restaurants){
            List<Restaurant> cityRestaurants = result.get(restaurant.getCity());
            if( cityRestaurants== null) {
                cityRestaurants = new ArrayList<>();
                result.put(restaurant.getCity(), cityRestaurants);
            }
            cityRestaurants.add(restaurant);
        }
        return result;
    }
}

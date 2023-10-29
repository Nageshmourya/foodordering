package com.Nagesh.foodOrdering.Repo;


import com.Nagesh.foodOrdering.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepo extends JpaRepository<Restaurant, Integer> {
    Restaurant findByRestaurantName(String restaurantName);

    Restaurant findByRestaurantEmail(String restaurantEmail);
}

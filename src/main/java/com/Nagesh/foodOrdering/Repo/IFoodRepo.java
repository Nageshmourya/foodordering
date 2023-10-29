package com.Nagesh.foodOrdering.Repo;
import com.Nagesh.foodOrdering.Model.Cuisine;
import com.Nagesh.foodOrdering.Model.FCategory;
import com.Nagesh.foodOrdering.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFoodRepo extends JpaRepository<Food,Integer> {


    Food findFirstByFoodName(String foodName);

    List<Food> findByFoodNameAndFoodCategoryAndFoodCuisineAndFoodPrice(String foodName, FCategory foodCategory, Cuisine foodCuisine, Double foodPrice);
}

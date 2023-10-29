package com.Nagesh.foodOrdering.Model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Validated
@JsonIdentityInfo(generator= ObjectIdGenerators.PropertyGenerator.class,scope=Food.class,property="foodId")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;

    @NotBlank
    private String foodName;

    @Enumerated(EnumType.STRING)
    private FCategory foodCategory;

    @Enumerated(EnumType.STRING)
    private Cuisine foodCuisine;
    private Double foodPrice;

    @ManyToMany
    @JoinTable(name = "food_restaurant",joinColumns = @JoinColumn(name = "fk_foodId"),inverseJoinColumns = @JoinColumn(name = "fk_restaurantId"))
    List<Restaurant> restaurantList;

}
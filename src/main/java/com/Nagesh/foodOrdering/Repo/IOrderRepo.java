package com.Nagesh.foodOrdering.Repo;


import com.Nagesh.foodOrdering.Model.Order;
import com.Nagesh.foodOrdering.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IOrderRepo extends JpaRepository<Order,Integer> {
    List<Order> findByUser(User user);
}
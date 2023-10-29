package com.Nagesh.foodOrdering.Service;



import com.Nagesh.foodOrdering.Model.Order;
import com.Nagesh.foodOrdering.Model.User;
import com.Nagesh.foodOrdering.Repo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    IOrderRepo orderRepo;

    public void createOrder(Order order) {
        orderRepo.save(order);
    }

    public List<Order> getHistory(User user) {
        return orderRepo.findByUser(user);
    }

    public Order getOrderDetails(Integer orderId) {
        return orderRepo.findById(orderId).orElseThrow();
    }

    public void deleteOrder(Order order) {
        orderRepo.delete(order);
    }

    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
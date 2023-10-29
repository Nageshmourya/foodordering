package com.Nagesh.foodOrdering.Repo;



import com.Nagesh.foodOrdering.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Integer> {
    User findFirstByUserEmail(String newEmail);
}
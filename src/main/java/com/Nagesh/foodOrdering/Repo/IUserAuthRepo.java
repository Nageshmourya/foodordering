package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Authen.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserAuthRepo extends JpaRepository<UserAuth,Integer> {
    UserAuth findByTokenValue(String tokenValue);
}
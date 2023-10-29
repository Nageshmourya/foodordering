package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Authen.AdminAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminAuthRepo extends JpaRepository<AdminAuth,Integer> {
    AdminAuth findByTokenValue(String tokenValue);
}

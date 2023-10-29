package com.Nagesh.foodOrdering.Repo;


import com.Nagesh.foodOrdering.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo  extends JpaRepository<Admin,Integer> {
    Admin findFirstByAdminEmail(String email);
}

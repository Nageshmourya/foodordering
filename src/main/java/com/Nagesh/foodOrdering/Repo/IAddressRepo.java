package com.Nagesh.foodOrdering.Repo;

import com.Nagesh.foodOrdering.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Integer> {

}

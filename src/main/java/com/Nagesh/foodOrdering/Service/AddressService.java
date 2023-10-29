package com.Nagesh.foodOrdering.Service;



import com.Nagesh.foodOrdering.Model.Address;
import com.Nagesh.foodOrdering.Repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {

        addressRepo.save(address);
    }
}
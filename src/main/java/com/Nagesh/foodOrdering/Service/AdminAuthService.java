package com.Nagesh.foodOrdering.Service;

import com.Nagesh.foodOrdering.Model.Authen.AdminAuth;
import com.Nagesh.foodOrdering.Repo.IAdminAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminAuthService {

    @Autowired
    IAdminAuthRepo adminAuthRepo;
    public void createToken(AdminAuth token) {
        adminAuthRepo.save(token);
    }

    public boolean authenticate(String email, String tokenValue) {
        AdminAuth token = adminAuthRepo.findByTokenValue(tokenValue);
        if(token!=null){
            return token.getAdmin().getAdminEmail().equals(email);
        }
        return false;
    }

    public void deleteToken(String tokenValue) {
        AdminAuth token = adminAuthRepo.findByTokenValue(tokenValue);
        adminAuthRepo.delete(token);
    }
}

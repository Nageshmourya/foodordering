package com.Nagesh.foodOrdering.Service;


import com.Nagesh.foodOrdering.Model.Authen.UserAuth;
import com.Nagesh.foodOrdering.Repo.IUserAuthRepo;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {
    @Autowired
    IUserAuthRepo userAuthRepo;

    public void createToken(UserAuth token) {
        userAuthRepo.save(token);
    }

    public boolean authenticate(String email, String tokenValue) {
        UserAuth token = userAuthRepo.findByTokenValue(tokenValue);
        if (token!=null){
            return token.getUser().getUserEmail().equals(email);
        }
        return false;
    }

    public void deleteToken(String tokenValue) {
        UserAuth token = userAuthRepo.findByTokenValue(tokenValue);
        userAuthRepo.delete(token);
    }
}

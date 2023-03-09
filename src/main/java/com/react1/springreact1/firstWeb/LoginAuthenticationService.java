package com.react1.springreact1.firstWeb;
import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {
    public boolean authtication(String username,String password){
        boolean isValidUsername=username.equalsIgnoreCase("chento");
        boolean isValidPassword=password.equalsIgnoreCase("1234");
        return (isValidPassword && isValidUsername);
    }
}

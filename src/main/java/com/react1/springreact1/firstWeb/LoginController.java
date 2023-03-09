package com.react1.springreact1.firstWeb;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {
    private LoginAuthenticationService authenticationServer=new LoginAuthenticationService();
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String goToLoginPage(){
        return "login";
    }
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String goToWelcomePage(@RequestParam("name") String name,@RequestParam("password") String password,ModelMap modelMap){
        if(authenticationServer.authtication(name,password)){
            modelMap.put("name",name);
            modelMap.put("password",password);
        }
        modelMap.put("error","incorrect try again");
        return "login";
    }

}

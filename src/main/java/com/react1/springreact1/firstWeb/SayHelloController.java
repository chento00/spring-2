package com.react1.springreact1.firstWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping(path = "say-hello")
    @ResponseBody
    public String sayHello(){
        return "hello world";
    }
    @RequestMapping(path = "say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb=new StringBuffer();
        sb.append("<!DOCTYPE html>");
        sb.append("<html lang=\"en\">");
        sb.append( "<head>");
        sb.append("<title>Document</title>");
        sb.append("</head>");
        sb.append("</body>");
        sb.append("<h1>hello </h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    @RequestMapping(path = "say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}

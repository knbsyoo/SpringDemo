package self.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Description
 */
@Controller
class Hello {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        return "/hello";
    }
}

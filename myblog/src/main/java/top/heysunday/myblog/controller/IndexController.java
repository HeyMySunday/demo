package top.heysunday.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
//标明是一个控制
public class IndexController {
    String contact = "contact?";
    String home = "index?";
    String blog = "blog?";
  /*  @RequestMapping("/")
    public String index(HttpServletRequest request) {
        System.out.println("request"+request);
        request.setAttribute("contact", contact);
        request.setAttribute("home", home);
        request.setAttribute("blog", blog);
        return "themes/default/header";
    }
    @RequestMapping("/index")
    public String home(HttpServletRequest request) {
        request.setAttribute("contact", contact);
        request.setAttribute("home", home);
        request.setAttribute("blog", blog);
        return "comm/index";
    }*/
    @RequestMapping("/blog")
    public String blog(HttpServletRequest request) {
        request.setAttribute("contact", contact);
        request.setAttribute("home", home);
        request.setAttribute("blog", blog);
        return "comm/blog";
    }
  /*  @RequestMapping("/blog")
    public String blog(HttpServletRequest request, @RequestParam("id") int blogId) {
        System.out.println("----------有参数----------");
        return "comm/blog";
    }*/
    @RequestMapping("/contact")
    public String contact(HttpServletRequest request) {
        request.setAttribute("contact", contact);
        request.setAttribute("home", home);
        request.setAttribute("blog", blog);
        String news = "你好呀";
        request.setAttribute("news", news);
        return "comm/contact";
    }
    @RequestMapping("/indexone")
    public String indexOne(HttpServletRequest request, @RequestParam("id") int blogId) {
        System.out.println("request"+request);
        System.out.println("id"+blogId);
        String message = "你好呀";
        String news = "重大发现";
        request.setAttribute("message", message);
        request.setAttribute("news", news);
        return "comm/indexnew";
    }

}

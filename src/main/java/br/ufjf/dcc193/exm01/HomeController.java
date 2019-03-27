package br.ufjf.dcc193.exm01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping("index.html")
    ModelAndView home(Pessoa p){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("pessoa", p);
        return mv;
    }

    @RequestMapping("form.html")
    String form(){
        return "form";
    }
    
}
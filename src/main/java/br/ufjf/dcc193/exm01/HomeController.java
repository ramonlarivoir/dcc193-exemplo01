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
    ModelAndView home(String nome){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home");
        mv.addObject("nome", nome);
        System.out.println(nome);
        return mv;
    }
    
}
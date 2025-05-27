package in.lakshayrathor.portifolio.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/","","/home"})
    public String showHomePage(Model model){
        model.addAttribute("tittle","Home");
        return "master";
    }

    @GetMapping("/resume")
    public String showResumePage(Model model){
        model.addAttribute("tittle","Resume");
        return "master";
    }

    @GetMapping("/projects")
    public String showProjectsPage(Model model){
        model.addAttribute("tittle","Projects");
        return "master";
    }

    @GetMapping("/contact")
    public String showContactPage(Model model){
        model.addAttribute("tittle","Contact");
        return "master";
    }
}

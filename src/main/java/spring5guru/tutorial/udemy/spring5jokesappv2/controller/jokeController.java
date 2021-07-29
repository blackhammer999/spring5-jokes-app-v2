package spring5guru.tutorial.udemy.spring5jokesappv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring5guru.tutorial.udemy.spring5jokesappv2.service.jokesService;

@Controller
public class jokeController {
      private final jokesService Jokes;

  public jokeController(jokesService jokes) {
    Jokes = jokes;
  }
  @RequestMapping({"/",""})
  public String GetJokes(Model model){
    model.addAttribute("joke",Jokes.getJokes());
    return "index";
  }
}

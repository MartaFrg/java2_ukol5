package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {
  @RequestMapping("/")
  @GetMapping("")
  public ModelAndView formular() {
    ModelAndView modelAndView = new ModelAndView("/formular");
    modelAndView.addObject("registrace", new RegistraceForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@Valid @ModelAttribute("registrace") RegistraceForm registrace, BindingResult bindingResult) {

    if (bindingResult.hasErrors()) {
      return "/formular";
    }
    ModelAndView rekapitulace = new ModelAndView("rekapitulace");
    rekapitulace.addObject("registrace", registrace);
    return "/rekapitulace";
  }
}

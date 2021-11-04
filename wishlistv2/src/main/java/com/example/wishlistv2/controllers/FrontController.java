package com.example.wishlistv2.controllers;


import com.example.wishlistv2.domain.model.Bruger;
import com.example.wishlistv2.domain.servives.LoginSampleException;
import com.example.wishlistv2.domain.servives.LoginService;
import com.example.wishlistv2.respositories.BrugerRepositoryImpl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class FrontController {

private LoginService loginService = new LoginService(new BrugerRepositoryImpl());

  @GetMapping("/")
  public String index() { return "index"; }

  @PostMapping("/login")
  public String loginBruger(WebRequest request) throws LoginSampleException {
    String email = request.getParameter("email");
    String kodeord = request.getParameter("kodeord");

    Bruger bruger = loginService.login(email, kodeord);

    request.setAttribute("bruger", bruger, WebRequest.SCOPE_SESSION);

    return null;
  }

  @GetMapping("/opretbruger")
  public String opretbruger(WebRequest request) throws LoginSampleException{
    String fornavn = request.getParameter("fornavn");
    String efternavn = request.getParameter("efternavn");
    String email = request.getParameter("email");
    String kodeord = request.getParameter("kodeord");
    String gentagkodeord = request.getParameter("gentagkodeord");
/*
    if (kodeord.equals(gentagkodeord)){
      Bruger bruger = loginService.opretBruger(fornavn, efternavn, email, kodeord);
      request.setAttribute("bruger", bruger, WebRequest.SCOPE_SESSION);
*/
 //     return "null" ;
  //  } else {
  //    throw  new LoginSampleException("koderne stemmer ikke overens");

 //  }
    return "opretbruger";
  }



  @PostMapping("/gemBruger")
  public String gemBruger(@ModelAttribute("Bruger") Bruger bruger){
    loginService.gem(bruger);
    return "redirect:/";
  }
  @PostMapping("/visOpretBruger")
  public String visOpretBruger(Model model){
    Bruger bruger = new Bruger();
    model.addAttribute("bruger", bruger);
    return "opretbruger";

  }
}

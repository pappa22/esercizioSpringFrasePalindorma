package it.dstech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.gestione.Service;

@Controller
public class belController {
	
	@RequestMapping(value  = "/calcolatore")
	public ModelAndView checkParameter(@RequestParam("testo") String testo, Model model) {
		Service s = new Service();
		ModelAndView vista = new ModelAndView("risultato");
		vista.addObject("testo", testo);
		vista.addObject("checkPal", s.checkPalindromo(testo));
		vista.addObject("numeroParF", s.numeroParoleFrase(testo));
		vista.addObject("numeroParP", s.numeroParolePalindrome(testo));
		return vista;
	}
	

}

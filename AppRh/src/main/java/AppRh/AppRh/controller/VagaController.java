package AppRh.AppRh.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import AppRh.AppRh.repository.CandidatoRepository;
import AppRh.AppRh.repository.VagaRepository;



@Controller
public class VagaController {
	
	
	
	private VagaRepository vr;
	private CandidatoRepository cr;
	
	
	//CADSTRAR VAGA
    @RequestMapping(value="/cadastraVaga",method = RequestMethod.GET)
	public String form() {
		
		return "vaga/formVaga";			
		
	}
    
    
    //CADSTRAR VAGA
    @RequestMapping(value="/cadastraVaga",method = RequestMethod.POST)
    public String form(@Valid Vaga vaga, BindingResult result, RedirectAttributes attributes) {
    	
    	if(result.hasErrors()) {
    		
    		attributes.addFlashAttribute("mensagem","Verifique os campos...");
    		
    	}
    	
    	return "vaga/formVaga";			
    	
    }
	
	
	

}

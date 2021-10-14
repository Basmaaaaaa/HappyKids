package happykids.tn.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import happykids.tn.service.IMessageservice;

@Controller
public class MessageControlleur {
	@Autowired	
	IMessageservice msgService ; 
	// route  pour getALLMessage 
	
	
	// route pour suppresion de message 
	
	
	@RequestMapping("/show")
	public String show(Model model,  @RequestParam int id) { 
		model.addAttribute("IME",  msgService.getMessageById(id) ); 
		return "showMessage" ; 
	}
	//sendMessage

}

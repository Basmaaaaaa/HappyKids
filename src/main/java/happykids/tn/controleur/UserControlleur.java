package happykids.tn.controleur;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import happykids.tn.entities.Message;
import happykids.tn.entities.User;
import happykids.tn.service.IMessageservice;
import happykids.tn.service.IUserservice;



@Controller
public class UserControlleur {
	@Autowired
	IUserservice userService ; 
	@Autowired
	IMessageservice msgService; 
	
	
	@RequestMapping("/login")
	public String mogin(
			Model model,@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout
			) throws ServletException, IOException{ 
		if (error != null) {
			model.addAttribute("error", " Coordonnées invalides!");  
		} 
		if (logout != null) {
			model.addAttribute("msg", "Déconnexion réussite!");
		}
		return "index"; 
	}

	@RequestMapping("/menu")
	private String menu( HttpServletRequest request) { 
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String login = auth.getName();
		User user = userService.getUserByLoginnnn(login);
		List<Message> msgs = msgService.getAll(user.getId());
		request.getSession().setAttribute("USER", user); 
		request.getSession().setAttribute("MSGS", msgs);
		return "menu_principale" ; 
	}
}

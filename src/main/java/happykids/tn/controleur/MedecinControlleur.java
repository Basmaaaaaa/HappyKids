package happykids.tn.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IMedecinservice;


@Controller
public class MedecinControlleur {
	@Autowired
	IMedecinservice medecinService;
	
 
	@RequestMapping("/deleteMedecin")
	public String delete(@RequestParam int id , RedirectAttributes res) { 
		medecinService.deleteMedecin(id);
		res.addFlashAttribute("msg", "Suppresion du medecin avec succées");
		return "redirect:/listMedecins" ; 
	}
	
	@RequestMapping("/bloquerMedecin")
	public String bloquer(@RequestParam int id , RedirectAttributes res) { 
		medecinService.bloquerMedecin(id); 
		res.addFlashAttribute("msg", "Bloquage du medecin avec succées");
		return "redirect:/listMedecins" ; 
	}
	
	
	@RequestMapping("/ajoutMedecin")
	public String ajout() { 
		return "ajoutMedecin" ; 
	}
	@RequestMapping("/listMedecins")
	public String all(Model model) {
		model.addAttribute("MEDECIN", medecinService.getAll()); 
		return "listMedecins" ; 
	}
	
	
	@RequestMapping("/showMedecin")
	public String show(Model model,  @RequestParam int id) {
		model.addAttribute("INFOM", medecinService.getById(id)); 
		return "editMedecin" ; 
	}
	
	@RequestMapping("/addMedecin")
	public String add(@RequestParam String nom, @RequestParam String prenom, @RequestParam String adresse, @RequestParam int numerotel, 
			@RequestParam String pass, @RequestParam String login , RedirectAttributes res) { 
		medecinService.addMedecin(nom, prenom, adresse, numerotel, login, pass);
		res.addFlashAttribute("msg", "Ajout d'un medecin avec succées");
		return "redirect:/listMedecins" ; 
	}
	
	@RequestMapping("/editMedecin")
	public String edit(@RequestParam int id, @RequestParam String nom, @RequestParam String prenom, @RequestParam String adresse, @RequestParam int numtel, 
			@RequestParam String pass, @RequestParam String login , RedirectAttributes res) { 
		medecinService.editMedecin(id, nom, prenom, adresse, numtel, login, pass);
		res.addFlashAttribute("msg","Modification d'un medecin avec succées");
		return "redirect:/listMedecins" ; 
	}
	


}

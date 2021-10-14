package happykids.tn.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IEnseignantservice;
import happykids.tn.service.IGroupeservice;

@Controller
public class EnseignantControlleur {
	@Autowired
	IEnseignantservice ensService ; 
	@Autowired
	IGroupeservice groupeService ; 
	
	
	@RequestMapping("/deleteEnseignant")
	public String delete(@RequestParam int id , RedirectAttributes res) { 
		ensService.deleteEnseignant(id);
		res.addFlashAttribute("msg", "Suppresion d'un enseignant avec succées");
		return "redirect:/listEnseignants" ; 
	}
	
	
	@RequestMapping("/ajoutEnseignant")
	public String ajout(Model model) { 
		model.addAttribute("LG", groupeService.getAll()); 
		return "ajoutEnseignant" ; 
	}
	
	@RequestMapping("/listEnseignants")
	public String all(Model model) {
		model.addAttribute("LES", ensService.getAll()); 
		return "listEnseignants" ; 
	}
	
	
	@RequestMapping("/showEnseignant")
	public String show(Model model,  @RequestParam int id) {
		model.addAttribute("LG", groupeService.getAll());
		model.addAttribute("IE",  ensService.getByID(id) ); 
		return "editEnseignant" ; 
	}
	
	@RequestMapping("/addEnseignant")
	public String add(@RequestParam String nom, @RequestParam String prenom, @RequestParam String adresse, @RequestParam int tel,  @RequestParam int groupe,
			@RequestParam String pass, @RequestParam String login, @RequestParam String spec , RedirectAttributes res) { 
		ensService.addEnseignant(nom, prenom, adresse, tel, login, pass,  spec, groupe);
		res.addFlashAttribute("msg", "Ajout d'un enseignant avec succées");
		return "redirect:/listEnseignants" ; 
	}
	
	
	@RequestMapping("/editEnseignant")
	public String edit(@RequestParam int id, @RequestParam String nom, @RequestParam String prenom, @RequestParam String adresse, @RequestParam int tel,   @RequestParam int groupe,
			@RequestParam String pass, @RequestParam String login, @RequestParam String spec, RedirectAttributes res ) { 
		ensService.editEnseignant(id, nom, prenom, adresse, tel, login, pass, spec, groupe);
		res.addFlashAttribute("msg", "Modification d'un enseignant avec succées");
		return "redirect:/listEnseignants" ; 
	}
}

package happykids.tn.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IGroupeservice;

@Controller
public class GroupeControlleur {
	@Autowired
	IGroupeservice groupeService;
	
	@RequestMapping("/listGroupes")
	public String list(Model model) {
		model.addAttribute("Groupe",groupeService.getAll());
	       return "listGroupes" ; 
	}
	
	@RequestMapping("/ajoutGroupe")
	public String ajout() {
		return "ajoutGroupe";
	}

	@RequestMapping("/addGroupe")
	public String addGroupe(@RequestParam String nom , RedirectAttributes res) {
		groupeService.addGroupe(nom);
		res.addFlashAttribute("msg", "ajout d'un groupe effectuée avec succées");
		return "redirect:/listGroupes";
	}
	
	@RequestMapping("/showGroupe")
	public String editGroupe(@RequestParam int id , Model model) {
		model.addAttribute("INFOG",groupeService.getByID(id));
		return "editGroupe";
	}
	
	@RequestMapping("/editGroupe")
	public String edit(@RequestParam int id , @RequestParam String nom , RedirectAttributes res) {
		groupeService.editGroupe(id, nom);
		res.addFlashAttribute("msg", "Modification d'un groupe effectuée avec succées");
		return "redirect:/listGroupes";
	}
	
	@RequestMapping("/deleteGroupe")
	public String delete(@RequestParam int id , RedirectAttributes res) {
		groupeService.deleteGroupe(id);
		res.addFlashAttribute("msg", "Suppresion du groupe effectuée avec succées");
	       return "redirect:/listGroupes";
	}
}



















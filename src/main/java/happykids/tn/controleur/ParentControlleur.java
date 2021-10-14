package happykids.tn.controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.service.IParentservice;

@Controller

public class ParentControlleur {
	@Autowired
	IParentservice parentService;
	

	@RequestMapping("/deleteParent")
	public String delete(@RequestParam int id, RedirectAttributes res) {
		parentService.deleteParent(id);
		res.addFlashAttribute("msg", "Suppresion du parent effectuée avec succées"); 
		return"redirect:/listParents";
	}
	
	@RequestMapping("/ajoutParent")
	public String ajoutParent() {
		return "ajoutParent"; 
	}
	@RequestMapping("/listParents")
	public String list(Model model) {
		model.addAttribute("PARENT", parentService.getAll());
		return "listParents" ; 
	}
	@RequestMapping("/showParent") 
	public String show(@RequestParam int id,Model model) {
		model.addAttribute("INFOP", parentService.getById(id));
		return"editParent";
	}
	@RequestMapping("/addParent")
	public String add(@RequestParam String nom,@RequestParam String prenom,@RequestParam String adresse,
			@RequestParam int numTel,@RequestParam String login,@RequestParam String mdp,@RequestParam int numTel2, RedirectAttributes res) {
		parentService.addParent(nom, prenom, adresse, numTel, login, mdp, numTel2);
		res.addFlashAttribute("msg", "Ajout de parent effectuée avec succées"); 
		return"redirect:/listParents";
	}
	@RequestMapping("/editParent")
	public String edit(@RequestParam int id,@RequestParam String nom,@RequestParam String prenom,@RequestParam String adresse,
			@RequestParam int numTel,@RequestParam String login,@RequestParam int numTel2, RedirectAttributes res) {
		parentService.editParent(id, nom, prenom, adresse,  numTel, login,  numTel2);
		res.addFlashAttribute("msg", "Modification de parent effectuée avec succées"); 
		return"redirect:/listParents";
	}

}                        

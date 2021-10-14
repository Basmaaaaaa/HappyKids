package happykids.tn.controleur;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import happykids.tn.entities.User;
import happykids.tn.service.IEleveservice;
import happykids.tn.service.IObservationservice;

@Controller
public class ObservationControlleur {
	@Autowired
	IObservationservice observationService;
	@Autowired
	IEleveservice eleveService;
	
	@RequestMapping("/listObservations")
	public String listObservations(Model model) {
		model.addAttribute("OBSERVATION", observationService.getAll());
		return "listObservations";
	}
	@RequestMapping("/showObservation")
	public String show(Model model , @RequestParam  int id) {
		model.addAttribute("OB", observationService.getById(id));
		model.addAttribute("LE", eleveService.getAll() );
		return "editObservation";
	}
	@RequestMapping("/ajoutObservation")
	public String addObservation(Model model) {
		model.addAttribute("LE",eleveService.getAll());
			return "ajoutObservation";
	}
	@RequestMapping("/addObservation")
	public String add(HttpServletRequest request, @RequestParam String message , @RequestParam int eleve,RedirectAttributes res) {
		User urrr = (User) request.getSession().getAttribute("USER");
		observationService.addObservation(message,  eleve, urrr.getId());
		res.addFlashAttribute("msg", "Ajout d'une observation avec succées");
		return "redirect:/listObservations" ;
	}
	@RequestMapping("/editObservation")
	public String edit(@RequestParam int id,@RequestParam String message ,  @RequestParam int eleve ,RedirectAttributes res) {
		observationService.editObservation(id, message,  eleve);
		res.addFlashAttribute("msg", "Modification d'une observation avec succées");
		return "redirect:/listObservations" ;
	}
	@RequestMapping("/deleteObservation")
	public String delete(@RequestParam int id,RedirectAttributes res) {
		observationService.deleteObservation(id);
		res.addFlashAttribute("msg", "Suppresion d'une observation avec succées");
		return "redirect:/listObservations" ;
	}
}















package com.sqli.spring;



import com.sqli.spring.beans.Client;
import com.sqli.spring.service.AdminClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private AdminClientService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home( Model model) {
        model.addAttribute("clients", service.listClient());
        model.addAttribute("isEmpty",service.listClient().isEmpty());
        model.addAttribute("client",new Client());
		return "home";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addClient(@ModelAttribute("client") Client client, Model model) {
		service.addClient(client);
        model.addAttribute("clients", service.listClient());
		return "home";
	}
	
	@RequestMapping("/delete/{clientName}")
	public String deleteClient(@PathVariable("clientName") String name,Model model) {
		service.deleteClient(name);
		model.addAttribute("client", new Client());
        model.addAttribute("clients", service.listClient());
		return "home";
	}
	
	@RequestMapping("/edit/{clientName}")
	public String editClient(@PathVariable("clientName") String name,Model model) {
		model.addAttribute("client", service.getClientById(name));
        model.addAttribute("clients", service.listClient());
		return "home";
	}
	
	
	

}

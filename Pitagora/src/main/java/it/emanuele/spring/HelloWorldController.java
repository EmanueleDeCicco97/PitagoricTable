package it.emanuele.spring;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	private Tabella t = new Tabella();
	@RequestMapping("/")
	
	public String Prova(Map<String, Object> model) {

		model.put("Tabella", this.t);
		
		return "helloWorld";
	}
}
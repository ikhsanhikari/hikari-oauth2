package id.hikari.oauth2.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/home")
	public String index() {
		return "landing_page";
	}
	
	@RequestMapping("/oauth2/redirect")
	public String redirect() {
		return "admin";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
}

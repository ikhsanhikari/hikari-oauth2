package id.hikari.oauth2.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

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
    public String redirect(HttpServletRequest request, RedirectAttributes redirectAttributes) {
		Optional<String> token = Optional.ofNullable(request.getParameter("token"));
		Optional<String> error = Optional.ofNullable(request.getParameter("error"));
		if(token.isPresent()){
			return "redirect:/admin";
		}
        redirectAttributes.addFlashAttribute("error",error.get());

        return "redirect:/login";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "admin";
    }
}

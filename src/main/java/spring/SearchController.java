package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view.!");
		return "home";

	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectView = new RedirectView();

		if (query.isEmpty()) {
			redirectView.setUrl("/SpringMVCSearchProject/home");
			return redirectView;

		}
		String urlString = "https://www.google.com/search?q=" + query;
		redirectView.setUrl(urlString);
		return redirectView;

	}
}

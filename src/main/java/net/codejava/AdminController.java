package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
	 @GetMapping("/admin")
	    public String adminPage() {
	        return "administrator";
	    }

	    @GetMapping("/admin/user_management")
	    public String userManagement() {
	        return "user_management";
	    }
}

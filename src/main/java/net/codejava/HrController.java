package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HrController {

	 @GetMapping("/hr")
	    public String hrPage() {
	        return "hr";
	    }

	    @GetMapping("/hr/payroll_management")
	    public String payrollManagement() {
	        return "payroll_management";
	    }
}

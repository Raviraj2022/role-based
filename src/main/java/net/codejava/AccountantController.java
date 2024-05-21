package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountantController {
	 @GetMapping("/accountant")
	    public String accountantPage() {
	        return "accountant";
	    }

	    @GetMapping("/accountant/bill_management")
	    public String billManagement() {
	        return "bill_management";
	    }

	    @GetMapping("/accountant/payroll_management")
	    public String payrollManagement() {
	        return "payroll_management";
	    }
}

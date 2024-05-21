package net.codejava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SalesController {

	@GetMapping("/sales")
    public String salesPage() {
        return "sales";
    }

    @GetMapping("/sales/customer_management")
    public String customerManagement() {
        return "customer_management";
    }

    @GetMapping("/sales/bill_management")
    public String billManagement() {
        return "bill_management";
    }
}

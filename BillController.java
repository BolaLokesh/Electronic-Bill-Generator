package com.electricbillgenerator.controller;

import com.electricbillgenerator.model.Bill;
import com.electricbillgenerator.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller  // Marks this class as a Spring MVC controller
public class BillController {

    @Autowired
    private BillService billService;  // Inject the BillService to handle business logic

    // Home Page (landing page)
    @GetMapping("/")
    public String showHomePage() {
        return "index";  // Returns the index.jsp view
    }

    // Bill Generation Page
    @GetMapping("/generate-bill")
    public String showBillGenerationPage() {
        return "generate-bill";  // Returns the generate-bill.jsp view
    }

    // Handles form submission to generate the bill
    @PostMapping("/generate-bill")
    public String generateBill(@RequestParam String userId, @RequestParam double unitsConsumed, Model model) {
        double ratePerUnit = 10.0;  // Set a static rate per unit of electricity (e.g., 10)
        double totalAmount = unitsConsumed * ratePerUnit;  // Calculate total amount based on units consumed

        Bill bill = new Bill();
        bill.setUserId(userId);
        bill.setUnitsConsumed(unitsConsumed);
        bill.setTotalAmount(totalAmount);

        billService.saveBill(bill);  // Save the generated bill in the database

        model.addAttribute("bill", bill);  // Pass the generated bill data to the view
        return "bill-details";  // Return the bill-details.jsp view to display the bill
    }
}

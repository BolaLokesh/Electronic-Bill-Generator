package com.electricbillgenerator.service;

import com.electricbillgenerator.model.Bill;
import com.electricbillgenerator.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Service class that contains the business logic related to Bill
@Service  // Marks this class as a service component in Spring
public class BillService {

    @Autowired
    private BillRepository billRepository;  // Inject the BillRepository to interact with the database

    // Method to save the generated bill
    public void saveBill(Bill bill) {
        billRepository.save(bill);  // Save the bill in the database
    }
}

package com.electricbillgenerator.repository;

import com.electricbillgenerator.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface to handle CRUD operations for Bill
public interface BillRepository extends JpaRepository<Bill, Long> {
    // JpaRepository already provides basic CRUD methods like save(), findById(), delete(), etc.
}

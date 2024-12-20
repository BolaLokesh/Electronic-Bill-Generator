package com.electricbillgenerator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Entity class representing the Electric Bill
@Entity
public class Bill {

    @Id
    @GeneratedValue  // Automatically generates a unique ID for each bill
    private Long billId;
    private String userId;  // Linked to User who generated the bill
    private double unitsConsumed;  // Units of electricity used
    private double totalAmount;  // Total calculated bill amount

    // Getters and Setters for the bill details
    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(double unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}

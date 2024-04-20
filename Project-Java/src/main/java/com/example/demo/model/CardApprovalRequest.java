package com.example.demo.model;

import lombok.Data;

@Data
public class CardApprovalRequest {
	private String companyName;
	private double annualRevenue;
	private int yearsInBusiness;
	private String cardType;
	private double requestedCardLimit;
} 

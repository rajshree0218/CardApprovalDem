package com.example.demo.dao;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CardApproval {
	private String companyName;
	private double annualRevenue;
	private int yearsInBusiness;
	private String cardType;
	private double requestedCardLimit;
	private boolean approved;
	private String reason;
									
		public CardApproval(){}
		public CardApproval(String companyName,
								double annualRevenue,
								int yearsInBusiness,
								String cardType,
								double requestedCardLimit,
								boolean approved){
			this.companyName = companyName;
			this.annualRevenue = annualRevenue;
			this.yearsInBusiness = yearsInBusiness;
			this.cardType = cardType;
			this.requestedCardLimit = requestedCardLimit;
			this.approved = approved;
		}

		public CardApproval(String companyName,
								double annualRevenue,
								int yearsInBusiness,
								String cardType,
								double requestedCardLimit){
			this(companyName, annualRevenue, yearsInBusiness, cardType, requestedCardLimit, false);
	}
	
	
} 

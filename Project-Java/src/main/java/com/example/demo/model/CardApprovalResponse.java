package com.example.demo.model;

import lombok.Data;

@Data
public class CardApprovalResponse {
	
	private boolean approved;
	private String reason;

}

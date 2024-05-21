package com.example.demo.controller;

import com.example.demo.model.CardApprovalRequest;
import com.example.demo.model.CardApprovalResponse;
import com.example.demo.service.CardApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardApprovalController {

    @Autowired
    private CardApprovalService cardApprovalService;
 
    @PostMapping("/getApproval")
    public ResponseEntity<CardApprovalResponse> getApprovalDetails(@RequestBody CardApprovalRequest cardApprovalRequest) {
        CardApprovalResponse response = cardApprovalService.getApprovalDetails(cardApprovalRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

package com.example.demo.controller;

import com.example.demo.controller.CardApprovalController;
import com.example.demo.model.CardApprovalRequest;
import com.example.demo.model.CardApprovalResponse;
import com.example.demo.service.CardApprovalService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CardApprovalControllerTest {

    @Mock
    private CardApprovalService cardApprovalService;

    @InjectMocks
    private CardApprovalController cardApprovalController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetApprovalDetails() {

        CardApprovalRequest request = new CardApprovalRequest();
        request.setCompanyName("Example Business");
        request.setAnnualRevenue(100000);
        request.setYearsInBusiness(5);
        request.setRequestedCardLimit(5000);
        request.setCardType("corporate");

        CardApprovalResponse expectedResponse = new CardApprovalResponse();
        expectedResponse.setApproved(true);
        expectedResponse.setReason("Application approved based on annual revenue");

        when(cardApprovalService.getApprovalDetails(request)).thenReturn(expectedResponse);


        ResponseEntity<CardApprovalResponse> responseEntity = cardApprovalController.getApprovalDetails(request);

         Assertions.assertAll(
        	()->assertEquals(HttpStatus.OK, responseEntity.getStatusCode()),
        	()->assertEquals(expectedResponse, responseEntity.getBody()));

        // Verify that the service method was called with the correct request
        verify(cardApprovalService, times(1)).getApprovalDetails(request);
    }
}


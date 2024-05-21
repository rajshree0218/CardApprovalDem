package com.example.demo.service;

import com.example.demo.model.CardApprovalRequest;
import com.example.demo.model.CardApprovalResponse;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.KieContainer;

public class CardApprovalServiceTest {

    @Mock
    private KieContainer kieContainer;

    @Mock
    private KieSession kieSession;

    @InjectMocks
    private CardApprovalService cardApprovalService;

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

        when(kieContainer.newKieSession()).thenReturn(kieSession);

        cardApprovalService.getApprovalDetails(request);

        verify(kieContainer, times(1)).newKieSession();
        verify(kieSession, times(1)).setGlobal(eq("response"), any(CardApprovalResponse.class));
//        verify(kieSession, times(1)).insert(request);
        verify(kieSession, times(1)).fireAllRules();
        verify(kieSession, times(1)).dispose();
    }
}

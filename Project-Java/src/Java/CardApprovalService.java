package com.example.demo.service;

import com.example.demo.dao.CardApproval;
import com.example.demo.model.CardApprovalRequest;
import com.example.demo.model.CardApprovalResponse;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardApprovalService {

	@Autowired
    private KieContainer kieContainer;
 
    public CardApprovalResponse getApprovalDetails(CardApprovalRequest cardAppRequest) {

        CardApproval cardApproval = new CardApproval(cardAppRequest.getCompanyName(),
                cardAppRequest.getAnnualRevenue(),
                cardAppRequest.getYearsInBusiness(),
                cardAppRequest.getCardType(),
                cardAppRequest.getRequestedCardLimit()
                );

        CardApprovalResponse response = new CardApprovalResponse();
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("response", response);
        kieSession.insert(cardApproval);
        kieSession.fireAllRules();
        kieSession.dispose();
        return response;
    }

}

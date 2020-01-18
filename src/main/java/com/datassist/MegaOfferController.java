package com.datassist;

import com.datassist.payrollEntities.PayrollEntity;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MegaOfferController {
    @Autowired
    private KieSession session;

    @PostMapping("/order")
    public Order orderNow(@RequestBody Order order){
        session.insert(order);
        session.fireAllRules();
        return order;
    }

    @PostMapping("/payroll")
    public PayrollEntity checkPayroll(@RequestBody PayrollEntity payrollEntity){
        session.insert(payrollEntity);
        session.fireAllRules();
        return payrollEntity;
    }
}

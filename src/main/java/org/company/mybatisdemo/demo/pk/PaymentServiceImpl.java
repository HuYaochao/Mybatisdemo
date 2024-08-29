package org.company.mybatisdemo.demo.pk;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " dollars");
    }
}

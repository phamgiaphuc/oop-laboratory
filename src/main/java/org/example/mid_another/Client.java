package org.example.mid_another;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private final List<PaymentAccount> paymentAccounts;

    public Client(String name) {
        this.name = name;
        paymentAccounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPaymentAccount(PaymentAccount paymentAccount) {
        paymentAccounts.add(paymentAccount);
    }

    public void displayBalance() {
        System.out.println("Display client accounts for " + name);
        for (PaymentAccount paymentAccount : paymentAccounts) {
            System.out.println(paymentAccount.toString());
        }
        System.out.println();
    }
}

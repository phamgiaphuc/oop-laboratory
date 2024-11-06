package org.example.mid_another;

public class CashAccount extends PaymentAccount{
    public CashAccount(String name, double amount) {
        super(name, amount);
    }

    @Override
    public void executePayment(double payment) {
        super.setAmount(super.getAmount() - payment);
    }

    public String toString() {
        return super.toString();
    }
}

package org.example.mid_another;

public class EWalletAccount extends PaymentAccount{
    private double fee = 0.1;

    public EWalletAccount(String name, double amount) {
        super(name, amount);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public void executePayment(double payment) {
        super.setAmount(super.getAmount() - payment);
    }

    public String toString() {
        return super.toString();
    }
}

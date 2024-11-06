package org.example.mid_another;

public abstract class PaymentAccount {
    private String name;
    private double amount;

    public PaymentAccount(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public boolean checkBeforePayment(double payment) {
        return payment < amount;
    }

    public abstract void executePayment(double payment);

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "PaymentAccount [name = " + name + ", amount = " + amount + "]";
    }
}

package org.example.mid_another;

public class Shop {
    private String name;
    private final ShopAccount shopAccount;

    public Shop(String name) {
        this.name = name;
        this.shopAccount = new ShopAccount(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void acceptPayment(PaymentAccount paymentAccount, double payment) {
        if (!paymentAccount.checkBeforePayment(payment)) {
            System.out.println("This account does not have enough money to pay.\n");
        } else {
            double payment_amount = 0;
            if (paymentAccount instanceof CashAccount) {
                payment_amount = payment;
            } else if (paymentAccount instanceof EWalletAccount) {
                payment_amount = payment + ((EWalletAccount) paymentAccount).getFee();
            }
            paymentAccount.executePayment(payment_amount);
            shopAccount.executePayment(payment_amount);
            System.out.printf("%.2f is added to the account\n\n", payment_amount);
        }
    }

    public void displayBalance() {
        System.out.print("Display shop account for " + name + ": " + shopAccount + "\n");
    }
}

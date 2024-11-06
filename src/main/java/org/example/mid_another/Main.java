package org.example.mid_another;

public class Main {
    public static void main(String[] args) {
        myCanteen();
    }

    public static void myCanteen() {
        Shop s1 = new Shop("Vui vẻ vui vẻ");
        Shop s2 = new Shop("Mừng ngày lương về");

        Client c1 = new Client("Hân");
        Client c2 = new Client("Phúc");

        CashAccount c1CashAccount = new CashAccount(c1.getName(), 100);
        EWalletAccount c1EWalletAccount = new EWalletAccount(c1.getName(), 100);

        CashAccount c2CashAccount = new CashAccount(c2.getName(), 50);
        EWalletAccount c2EWalletAccount = new EWalletAccount(c2.getName(), 50);

        c1.addPaymentAccount(c1CashAccount);
        c1.addPaymentAccount(c1EWalletAccount);

        c2.addPaymentAccount(c2CashAccount);
        c2.addPaymentAccount(c2EWalletAccount);

        s1.acceptPayment(c1CashAccount, 10);
        s2.acceptPayment(c2CashAccount, 5);
        s2.acceptPayment(c2EWalletAccount, 5);

        c1.displayBalance();
        c2.displayBalance();

        s1.displayBalance();
        s2.displayBalance();
    }
}

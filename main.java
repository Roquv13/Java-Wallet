import java.util.Scanner;

class AmountChange {
    float amountUser;
    Scanner sc = new Scanner(System.in);
    public void init() {
        System.out.println("Add your initial amount of wallet: ");
        amountUser = sc.nextFloat();
    }
    public void add(float amount) {
        amountUser = amountUser + amount;
        System.out.println("Amount added: " + amount);
    }

    public void remove(float amount) {
        amountUser = amountUser - amount;
        System.out.println("Amount removed: " + amount);
    }

    public void usrAmount() {
        System.out.println("Amount on user account: " + amountUser);
    }
}

class Currency {
    float amountUser;
    float amountCurrency;
    public void usd(float currency) {
        currency = 1/currency;
        amountCurrency = amountUser * currency;
        System.out.println("Value of wallet in USD: " + amountCurrency);
    }

    public void euro(float currency) {
        currency = 1/currency;
        amountCurrency = amountUser * currency;
        System.out.println("Value of wallet in EURO: " + amountCurrency);
    }

    public void chf(float currency) {
        currency = 1/currency;
        amountCurrency = amountUser * currency;
        System.out.println("Value of wallet in CHF: " + amountCurrency);
    }
}
public class main {
    public static void main(String[] args) {
        AmountChange amoChg = new AmountChange();
        Scanner sc = new Scanner(System.in);

        amoChg.init();
        System.out.println("Do you want to add more money to wallet? ");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int userAns = sc.nextInt();
        if (userAns == 1) {
            System.out.println("Add amount to wallet: ");
            float amountToAdd = sc.nextFloat();
            amoChg.add(amountToAdd);
        } else if (userAns == 2) {
            System.out.println("Remove amount from wallet: ");
            float amountToRemove = sc.nextFloat();
            amoChg.remove(amountToRemove);
        } else System.out.println("Type again!");
        amoChg.usrAmount();
    }
}

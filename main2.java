import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Amount {
    Scanner sc = new Scanner(System.in);
    float userAmount;
    public void listChg() {
        System.out.println("1. Add amount");
        System.out.println("2. Remove amount");
        System.out.println("3. Display amount");
        System.out.println("4. Exit");
    }
    public float initAmount() {
        System.out.println("Add your initial amount of wallet: ");
        userAmount = sc.nextFloat();
        return userAmount;
    }

    public float add(float amount) {
        userAmount = userAmount + amount;
        System.out.println("Amount added: " + amount);
        return userAmount;
    }

    public float remove(float amount) {
        userAmount = userAmount - amount;
        System.out.println("Amount removed: " + amount);
        return userAmount;
    }

}

class CurrencyConverter {
    Scanner sc = new Scanner(System.in);
    float usdCurrency;
    float euroCurrency;
    float chfCurrency;
    BigDecimal amountUsd;
    BigDecimal amountEuro;
    BigDecimal amountChf;
    
    public void list() {
        System.out.println("List of actual currencies");
        System.out.println("1. USD");
        System.out.println("2. EURO");
        System.out.println("3. CHF");
        System.out.println("4. Exit");
    }
    public BigDecimal usd(float amount) {
        System.out.println("Type actual currency of USD: ");
        usdCurrency = sc.nextFloat();
        usdCurrency = 1/usdCurrency;
        amountUsd = BigDecimal.valueOf(amount * usdCurrency).setScale(2, RoundingMode.HALF_UP);
        return amountUsd;
    }
    public BigDecimal euro(float amount) {
        System.out.println("Type actual currency of EURO: ");
        euroCurrency = sc.nextFloat();
        euroCurrency = 1/euroCurrency;
        amountEuro = BigDecimal.valueOf(amount * euroCurrency).setScale(2, RoundingMode.HALF_UP);
        return amountEuro;
    }
    public BigDecimal chf(float amount) {
        System.out.println("Type actual currency of CHF: ");
        chfCurrency = sc.nextFloat();
        chfCurrency = 1/chfCurrency;
        amountChf = BigDecimal.valueOf(amount * usdCurrency).setScale(2, RoundingMode.HALF_UP);
        return amountChf;
    }
}
public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Amount amount = new Amount();
        CurrencyConverter currConv = new CurrencyConverter();
        //init
        amount.initAmount();
        System.out.println("What do you want to do?");
        amount.listChg();
        int chgAmount = sc.nextInt();
        while (true) {
            //add
            if (chgAmount == 1) {
                System.out.println("Type amount to add: ");
                float addValue = sc.nextFloat();
                amount.add(addValue);
                chgAmount = 0;
            }
            //remove
            else if (chgAmount == 2) {
                System.out.println("Type amount to remove: ");
                float removeValue = sc.nextFloat();
                amount.remove(removeValue);
                chgAmount = 0;
            }
            //display amount
            else if (chgAmount == 3) {
                System.out.println("Wallet amount: ");
                System.out.println(amount.userAmount);
                chgAmount = 0;
            } else if (chgAmount == 4) {
                break;
            } else System.out.println("Type again!");
            System.out.println("What do you want to do?");
            amount.listChg();
            chgAmount = sc.nextInt();
        }

        //currency
        currConv.list();
        System.out.println("Choose currency to calculate your amount of wallet: ");
        int currencyChoose = sc.nextInt();
        while (true) {
            //currency USD
            if (currencyChoose == 1) {
                currConv.usd(amount.userAmount);
                System.out.println("Amount of wallet in USD: ");
                System.out.println(currConv.amountUsd);
                currencyChoose = 0;
            }
            //currency EURO
            if (currencyChoose == 2) {
                currConv.euro(amount.userAmount);
                System.out.println("Amount of wallet in Euro: ");
                System.out.println(currConv.amountEuro);
                currencyChoose = 0;
            }
            //currency CHF
            if (currencyChoose == 3) {
                currConv.chf(amount.userAmount);
                System.out.println("Amount of wallet in Chf: ");
                System.out.println(currConv.amountChf);
                currencyChoose = 0;
            }
            //exit
            if (currencyChoose == 4) {
                break;
            }
            System.out.println("Do you want to choose other currency?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            int currNext = sc.nextInt();
            if (currNext == 1) {
                currConv.list();
                System.out.println("Choose currency to calculate your amount of wallet: ");
                currencyChoose = sc.nextInt();
            } else if (currNext == 2) {
                break;
            } else System.out.println("Type again!");
        }
    }
}

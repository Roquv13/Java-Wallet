import java.util.Scanner;

class Amount {
    Scanner sc = new Scanner(System.in);
    float userAmount;
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
    float amountUsd;
    float amountEuro;
    float amountChf;
    
    public float usd(float amount) {
        System.out.println("Type actual currency of USD: ");
        usdCurrency = sc.nextFloat();
        usdCurrency = 1/usdCurrency;
        amountUsd = amount * usdCurrency;
        return amountUsd;
    }
    public float euro(float amount) {
        System.out.println("Type actual currency of EURO: ");
        euroCurrency = sc.nextFloat();
        euroCurrency = 1/euroCurrency;
        amountEuro = amount * euroCurrency;
        return amountEuro;
    }
    public float chf(float amount) {
        System.out.println("Type actual currency of CHF: ");
        chfCurrency = sc.nextFloat();
        chfCurrency = 1/chfCurrency;
        amountChf = amount * chfCurrency;
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
        //add
        System.out.println("Type amount to add: ");
        float addValue = sc.nextFloat();
        amount.add(addValue);
        //remove
        System.out.println("Type amount to remove: ");
        float removeValue = sc.nextFloat();
        amount.remove(removeValue);
        //display amount
        System.out.println("Wallet amount: ");
        System.out.println(amount.userAmount);
        //currency USD
        currConv.usd(amount.userAmount);
        System.out.println("Amount of wallet in USD: ");
        System.out.println(currConv.amountUsd);
        //currency EURO
        currConv.euro(amount.userAmount);
        System.out.println("Amount of wallet in Euro: ");
        System.out.println(currConv.amountEuro);
        //currency CHF
        currConv.chf(amount.userAmount);
        System.out.println("Amount of wallet in Chf: ");
        System.out.println(currConv.amountChf);
        
    }
}

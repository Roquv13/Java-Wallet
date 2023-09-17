class AmountChange {
    float amountUser;

    public void add(float amount) {
        amountUser = amountUser + amount;
        System.out.println("Amount added: " + amount);
    }

    public void remove(float amount) {
        amountUser = amountUser - amount;
        System.out.println("Amount removed: " + amount);
    }
}
public class main {
    public static void main(String[] args) {

    }
}

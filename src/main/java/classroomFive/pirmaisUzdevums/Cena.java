package classroomFive.pirmaisUzdevums;

public class Cena {
    public double amount;
    public char currency;

    public Cena(double amount, char currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Cena{" +
                "amount=" + amount +
                ", currency=" + currency +
                '}';
    }
    public void discount(int discount){
        amount = amount - (amount *(discount/100));
    }

}


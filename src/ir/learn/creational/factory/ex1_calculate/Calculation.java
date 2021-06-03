package ir.learn.creational.factory.ex1_calculate;

public abstract class Calculation {
    protected int amountPerMonth;
    protected int taxPercent;
    protected String product;

    public Calculation() {
    }

    public Calculation(int amountPerMonth, int taxPercent, String product) {
        this.amountPerMonth = amountPerMonth;
        this.taxPercent = taxPercent;
        this.product = product;
    }
    public abstract int calculate();
}

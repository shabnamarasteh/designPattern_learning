package ir.learn.creational.factory.ex1_calculate;

public class CalculationFactory {
    public Calculation createCalculation(int amountPerMonth, int taxPercent, String product, boolean ferstival){
        if(festival){
            return new Calculation1(amountPerMonth, taxPercent, product);
        }else {
            return new Calculation2(amountPerMonth, taxPercent, product);
        }
    }
}

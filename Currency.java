
abstract class Decleration {
    public abstract void sToD();
    public abstract void sToE();
    public abstract void dToS();
    public abstract void dToE();
    public abstract void eToS();
    public abstract void eToD();
}

public enum Currency {
    SHEKEL(1), DOLLAR(3.1), EURO();
    public double value;
    public double amount;

    private Currency(double val) {
        value = val;
    }

    public void sToD() {
        DOLLAR.amount = SHEKEL.value
    }
}
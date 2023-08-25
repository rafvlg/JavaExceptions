package Seminar2;

public class DivisionException {
    private int dividend;

    public DivisionException(String message, int dividend) {
        super(message);
        this.dividend = dividend;
    }

    public int getDividend() {
        return dividend;
    }
}

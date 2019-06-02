public class Exponent {
    private double value;
    private int exp;

    public Exponent (double value, int exp) {
        this.value = value;
        this.exp = exp;
    }

    public double getResult () throws Exception {
        if (exp == 0 ) {
            return 1;
        }else if (value == 0) {
            if (exp<=0) {
                throw new Exception("error exp");
            }
            return 0;
        }else if (exp<0) {
            return 1/(value * getResult((-1*exp)-1));
        }
        return value * getResult(exp-1);
    }

    private double getResult (int n) {
        if (n == 0) {
            return 1;
        }
        return value * (getResult (n-1));
    }
}

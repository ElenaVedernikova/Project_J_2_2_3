public class CreditPaymentService {
    public double calculate(int amount, double rate, double timing){
        double xIndexRate = rate/100/12;
        double yIndexRate = Math.pow((1+xIndexRate),(timing*12));
        int payment  = (int) (amount * (xIndexRate + (xIndexRate/(yIndexRate-1))));
        return payment;
    }

}


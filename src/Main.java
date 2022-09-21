public class Main {
    public static void main(String[] args) {
        OneYear one = new OneYear();
        TwoYear two = new TwoYear();
        ThreeYear three = new ThreeYear();
        double monthlyPaymentForOneYear = one.calculateOne();
        double monthlyPaymentForTwoYear = two.calculateTwo();
        double monthlyPaymentForThreeYear = three.calculateThree();
        System.out.printf(" При сумме кредита на 1 год. Ежемесячный платеж = %.0f", monthlyPaymentForOneYear);
        System.out.printf(" При сумме кредита на 2 год. Ежемесячный платеж = %.0f", monthlyPaymentForTwoYear);
        System.out.printf(" При сумме кредита на 3 год. Ежемесячный платеж = %.0f", monthlyPaymentForThreeYear);
    }
}
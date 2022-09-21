public class OneYear {
    public double calculateOne() {
        double monthlyRate = 9.99 / 12 / 100;
        double exponentiation = Math.pow(1 + monthlyRate, 12);
        double annuityRatio = (monthlyRate * exponentiation) / (exponentiation - 1);
        double amountForOneMonth = annuityRatio * 1_000_000;
        return amountForOneMonth;
    }
}

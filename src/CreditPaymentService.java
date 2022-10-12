public class CreditPaymentService {
    public double calculate(double monthsCredit) {
        double monthlyRate = 9.99 / 12 / 100; // Месячная процентная ставка
        double exponentiation = Math.pow(1 + monthlyRate, monthsCredit); // Месячная процентная ставка возведенная в степень на количество месяцев + 1
        double annuityRatio = (monthlyRate * exponentiation) / (exponentiation - 1); // Коэффициент аннуитета
        double amountForOneMonth = annuityRatio * 1_000_000; // Аннуитетный взнос
        return amountForOneMonth;
    }
}

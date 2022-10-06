public class CreditPaymentService {
    public double calculate12(double monthlyRate) {
        double exponentiation = Math.pow(1 + monthlyRate, 12); // Месячная процентная ставка возведенная в степень на количество месяцев + 1
        double annuityRatio = (monthlyRate * exponentiation) / (exponentiation - 1); // Коэффициент аннуитета
        double amountForOneMonth12 = annuityRatio * 1_000_000; // Аннуитетный взнос
        return amountForOneMonth12;
    }

    public double calculate24(double monthlyRate) {
        double exponentiation24 = Math.pow(1 + monthlyRate, 24); // Месячная процентная ставка возведенная в степень на количество месяцев + 1
        double annuityRatio = (monthlyRate * exponentiation24) / (exponentiation24 - 1); // Коэффициент аннуитета
        double amountForOneMonth24 = annuityRatio * 1_000_000; // Аннуитетный взнос
        return amountForOneMonth24;
    }

    public double calculate36(double monthlyRate) {
        double exponentiation = Math.pow(1 + monthlyRate, 36); // Месячная процентная ставка возведенная в степень на количество месяцев + 1
        double annuityRatio = (monthlyRate * exponentiation) / (exponentiation - 1); // Коэффициент аннуитета
        double amountForOneMonth36 = annuityRatio * 1_000_000; // Аннуитетный взнос
        return amountForOneMonth36;
    }

}

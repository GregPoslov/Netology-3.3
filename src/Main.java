public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double monthlyRate = 9.99 / 12 / 100; // Месячная процентная ставка
        double twelveMonths = service.calculate12(monthlyRate); // Расчёт ежемесячного платежа на 12 месяцев
        double twentyFourMonths = service.calculate24(monthlyRate); // Расчёт ежемесячного платежа на 24 месяца
        double thirtySixMonths = service.calculate36(monthlyRate); // Расчёт ежемесячного платежа на 36 месяцев
        System.out.println("При сумме кредита 1000000 рублей. Сумма ежемесячного платежа составит:");
        System.out.println("На один год: " +  twelveMonths);
        System.out.println("На два года: " + twentyFourMonths);
        System.out.println("На три года: " + thirtySixMonths);
    }
}
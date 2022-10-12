public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println("Срок кредита: 1 год.Сумма кредита: 1000000 рублей. Сумма ежемесячного платежа составит:" + service.calculate(12));
        System.out.println("Срок кредита: 2 года.Сумма кредита: 1000000 рублей. Сумма ежемесячного платежа составит:" + service.calculate(24));
        System.out.println("Срок кредита: 3 года.Сумма кредита: 1000000 рублей. Сумма ежемесячного платежа составит:" + service.calculate(36));
    }
}
public class Main {
    public static void main(String[] args) {
        int sumLoan = 1_000_000;
        double interest = 9.99; // add percents by year

        CreditPaymentService service = new CreditPaymentService();
        int payment = service.LoanCalculate(sumLoan, interest, 1);
        System.out.println("Сумма кредита " + sumLoan + " срок кредита "
                + " 1 год");
        System.out.println("Ваш ежемесячный платеж");
        System.out.println("составит : " + payment);
        System.out.println("=============================================");

        CreditPaymentService service2 = new CreditPaymentService();
        int payment2 = service2.LoanCalculate(sumLoan, interest, 2);
        System.out.println("Сумма кредита " + sumLoan + " срок кредита "
                + "2 года");
        System.out.println("Ваш ежемесячный платеж");
        System.out.println("составит : " + payment2);
        System.out.println("=============================================");

        CreditPaymentService service3 = new CreditPaymentService();
        int payment3 = service3.LoanCalculate(sumLoan, interest, 3);
        System.out.println("Сумма кредита " + sumLoan + " срок кредита "
                + "3 года");
        System.out.println("Ваш ежемесячный платеж");
        System.out.println("составит : " + payment3);
        System.out.println("=============================================");

    }
}
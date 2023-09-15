public class Main {
    public static void main(String[] args) {
        int sum_loan = 1_000_000 ;
        double interest = 9.99 ; // add percents by year
        int loan_time = 2 ;
        CreditPaymentService service = new CreditPaymentService ();
        int payment = service.LoanCalculate( sum_loan , interest , loan_time);
        System.out.println ( payment );

    }
}
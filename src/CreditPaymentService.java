public class CreditPaymentService {
    public int LoanCalculate (
            int sum_loan ,
            double interest ,
            int loan_time )
    {
        int credit_time_month = loan_time * 12 ; // add loan time by month
        double interest_mont = (interest / 100) / 12 ; // add interest by month
        double a = Math.pow ((1+interest_mont) , credit_time_month) ; // service action
        double b = interest_mont * a ; // service action
        double c = a - 1 ; // service action
        double result = sum_loan * ( b / c) ; // result action
        int monthly_pay = (int) result ; // type mapping

        return monthly_pay ;
    }

}

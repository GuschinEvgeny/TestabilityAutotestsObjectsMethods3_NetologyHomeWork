public class CreditPaymentService {
    public int LoanCalculate(
            int sumLoan,
            double interest,
            int loanTime) {
        int creditTimeMonth = loanTime * 12; // add loan time by month
        double interestMonth = (interest / 100) / 12; // add interest by month
        double aPrecalculation = Math.pow((1 + interestMonth), creditTimeMonth); // service action
        double bPrecalculation = interestMonth * aPrecalculation; // service action
        double cPrecalculation = aPrecalculation - 1; // service action
        double result = sumLoan * (bPrecalculation / cPrecalculation); // result action
        int monthlyPay = (int) result; // type mapping

        return monthlyPay;
    }
}

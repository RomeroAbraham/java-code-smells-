public class Payroll {
    private int unusedOldConfig = 2020;

    public double calculatePay(double hours, double rate) {
        double pay = hours * rate;
        
        if (false) {
            System.out.println("Legacy bonus system");
            pay += 500;
        }
        
        return pay;
    }
  
    private void calculateOldTaxFormat() {
        System.out.println("Old tax formula");
    }
}

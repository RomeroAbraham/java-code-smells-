public class Account {
    private double balance;
    
    private Double auditTaxRate;
    private Double auditDeduction;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateAnnualAudit() {
        this.auditTaxRate = 0.15;
        this.auditDeduction = 50.0;
        
        double result = (balance * auditTaxRate) - auditDeduction;
        
        this.auditTaxRate = null;
        this.auditDeduction = null;
        return result;
    }
}

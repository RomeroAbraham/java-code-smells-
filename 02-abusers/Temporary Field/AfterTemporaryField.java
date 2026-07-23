class AccountAuditCalculator {
    private final double taxRate = 0.15;
    private final double deduction = 50.0;

    public double calculate(double balance) {
        return (balance * taxRate) - deduction;
    }
}

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double calculateAnnualAudit() {
        AccountAuditCalculator calculator = new AccountAuditCalculator();
        return calculator.calculate(balance);
    }
}

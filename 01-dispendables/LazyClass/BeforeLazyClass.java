class TaxCalculator {
    public double addTax(double amount) {
        return amount * 1.15;
    }
}

public class Invoice {
    private TaxCalculator taxCalculator = new TaxCalculator();

    public double calculateInvoiceTotal(double subtotal) {
        return taxCalculator.addTax(subtotal);
    }
}

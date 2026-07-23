class TaxCalculator {
    private static final double TAX_RATE = 0.15;

    public static double getTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    public static double getTotalWithTax(double subtotal) {
        return subtotal + getTax(subtotal);
    }
}

class Invoice {
    public double calculateTotal(double subtotal) {
        return TaxCalculator.getTotalWithTax(subtotal);
    }
}

class ShoppingCart {
    public double calculateEstimatedTax(double subtotal) {
        return TaxCalculator.getTax(subtotal);
    }
}

class FinancialReport {
    public void printTaxSummary(double subtotal) {
        System.out.println("Tax amount: " + TaxCalculator.getTax(subtotal));
    }
}

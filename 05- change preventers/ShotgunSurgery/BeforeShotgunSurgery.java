class Invoice {
    public double calculateTotal(double subtotal) {
        // Impuesto duplicado/disperso
        return subtotal + (subtotal * 0.15);
    }
}

class ShoppingCart {
    public double calculateEstimatedTax(double subtotal) {
        // Impuesto duplicado/disperso
        return subtotal * 0.15;
    }
}

class FinancialReport {
    public void printTaxSummary(double subtotal) {
        // Impuesto duplicado/disperso
        System.out.println("Tax amount: " + (subtotal * 0.15));
    }
}

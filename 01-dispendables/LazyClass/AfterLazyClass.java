public class Invoice {
    private static final double TAX_RATE = 0.15;

    public double calculateInvoiceTotal(double subtotal) {
        return subtotal + (subtotal * TAX_RATE);
    }
}

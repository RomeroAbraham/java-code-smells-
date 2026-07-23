public class OrderService {

    public void processOrder(String customerName, double price, int quantity) {
        validateOrder(customerName, price, quantity);
        double total = calculateTotal(price, quantity);
        printReceipt(customerName, total);
    }

    private void validateOrder(String customerName, double price, int quantity) {
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no es válido");
        }
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("El precio o la cantidad son inválidos");
        }
    }

    private double calculateTotal(double price, int quantity) {
        double subtotal = price * quantity;
        return subtotal + (subtotal * 0.15);
    }

    private void printReceipt(String customerName, double total) {
        System.out.println("=== RECIBO DE COMPRA ===");
        System.out.println("Cliente: " + customerName);
        System.out.println("Total a pagar: $" + total);
    }
}

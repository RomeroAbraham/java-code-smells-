public class OrderService {
    public void processOrder(String customerName, double price, int quantity) {
        if (customerName == null || customerName.isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no es válido");
        }
        if (price <= 0 || quantity <= 0) {
            throw new IllegalArgumentException("El precio o la cantidad son inválidos");
        }

        double subtotal = price * quantity;
        double tax = subtotal * 0.15;
        double total = subtotal + tax;

        System.out.println("=== RECIBO DE COMPRA ===");
        System.out.println("Cliente: " + customerName);
        System.out.println("Total a pagar: $" + total);
    }
}

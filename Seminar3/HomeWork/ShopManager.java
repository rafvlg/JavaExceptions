package Seminar3.HomeWork;



public class ShopManager {
    public static double purchaseProduct(int productId, int quantity) throws ProductNotFoundException, InsufficientQuantityException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null) {
            throw new ProductNotFoundException("Product not found");
        }

        if (product.getAvailableQuantity() < quantity) {
            throw new InsufficientQuantityException("Insufficient quantity");
        }

        double totalPrice = product.getPrice() * quantity;
        return totalPrice;
    }
}

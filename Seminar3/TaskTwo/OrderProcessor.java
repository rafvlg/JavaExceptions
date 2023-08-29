package Seminar3.TaskTwo;

import Seminar3.TaskTwo.Product;
import Seminar3.TaskTwo.exceptions.OrderException;

public class OrderProcessor {
        public static double processOrder(int productId, int quantity) throws OrderException {
        Product product = ProductDatabase.getProduct(productId);
        if (product == null) {
            throw new OrderException("Product not found.");
        }

        if (quantity > product.getAvailableQuantity()) {
            throw new OrderException("Not enough quantity available.");
        }

        double totalCost = product.getPrice() * quantity;
        return totalCost;
    }
}

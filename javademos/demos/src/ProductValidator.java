public class ProductValidator {
    public static boolean isValid(Product product) {
        if (product.Price > 0 && !product.Name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

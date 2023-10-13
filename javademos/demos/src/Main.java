public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.Name = "Klavye";
        product.Price = 500;

        ProductManager productManager = new ProductManager();
        productManager.add(product);
    }
}
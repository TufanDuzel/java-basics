public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop"); //product.name = "Laptop";
        product.setId(1);
        product.setDescription("Monster Notebook"); //product.description = "Monster Notebook";
        product.setPrice(10000); //product.price = 10000;
        product.setStockAmount(3); //product.stockAmount = 3;

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
    }
}
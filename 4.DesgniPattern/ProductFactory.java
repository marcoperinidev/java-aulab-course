
public class ProductFactory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("gallina product1")) {
            return new ConcreteProduct1();
        } else if (type.equalsIgnoreCase("gallina product2")) {
            return new ConcreteProduct2();
        } else {
            return null;
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Product product1 = new Product("One", "Apple");
        Product product2 = new Product("One", "Mango");
        Product product3 = new Product("Two", "Apple");
        Product product4 = new Product("Tree", "Banan");
        Products products = new ProductsImpl();
        products.setProduct.add(product1);
        products.setProduct.add(product2);
        products.setProduct.add(product3);

        for (Product prod : products.setProduct) {
            System.out.println(prod);
        }
//        Возвращает true - если продукта с таким id еще не было
        System.out.println(products.addProduct(product4));

//        Возвращает false - если был такой id, вставка отменяется
        System.out.println(products.addProduct(product1));

//        Возвращает true - если продукт с таким id был
        System.out.println(products.deleteProduct(product4));

//        возвроащает false - если id не было
        System.out.println(products.deleteProduct(product4));

//        возращает name продукта у которого идентификатор равен  (=) id
        System.out.println(products.getName("One"));

//        если продукта нет, вернуть пустую строку ""
        System.out.println(products.getName("Tree"));

//        возвращает массив (список) идентификаторов (id)
//        у котрых наименование равно (=) name
        System.out.println(products.findByName("Apple"));

//        Если таких нет, возвращается пустой массив (список)
        System.out.println(products.findByName("Banan"));
    }

}

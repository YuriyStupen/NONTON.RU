import java.util.HashSet;
import java.util.List;
import java.util.Set;

public interface Products {
    Set<Product> setProduct = new HashSet<>();
    boolean addProduct (Product product);

    boolean deleteProduct(Product product);

    String getName(String id);

    List<String> findByName(String name);
}

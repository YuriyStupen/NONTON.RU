import java.util.ArrayList;
import java.util.List;

public class ProductsImpl implements Products{

    public boolean addProduct(Product product) {
        if(!setProduct.contains(product)){
            setProduct.add(product);
            return true;
        }
        return false;
    }

    public boolean deleteProduct(Product product) {
        if (setProduct.contains(product)){
            setProduct.remove(product);
            return true;
        }
        return false;
    }

    public String getName(String id) {
        String name = "";
        for (Product product:setProduct) {
            if(product.getId().equals(id)){
                name = product.getName();
                break;
            }
        }
        return name;
    }

    public List<String> findByName(String name) {
        List<String> listId = new ArrayList<>();
        for(Product product:setProduct){
            if(product.getName().equals(name)){
                listId.add(product.getId());
            }
        }
        return listId;
    }
}

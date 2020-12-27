package enties.repositories;

import enties.products.Product;
import java.util.HashMap;

public class Products {
    private HashMap<String, Product> repository;

    public Products() {
            this.repository = new HashMap<>();
    }

    public boolean add(Product product) {
            this.repository.put(product.getId(), product);
            return true;
    }
    
    public void listarProdutos(){
        for(Product p : repository.values())
            System.out.println(p);
    }

    public boolean remove(String id) {
        return this.repository.remove(id) != null;
    }

    public Product get(String id) {
        return this.repository.get(id);
    }

    @Override
    public String toString() {
        return "Products[" + "repository=" + repository + "]";
    }
    
}

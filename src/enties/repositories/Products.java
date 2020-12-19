package enties.repositories;

import enties.products.Product;

public class Products {
    private HashMap<Integer, Product> repository;

	public Products() {
		this.repository = new HashMap<Int>();
	}
	
	public boolean add(Product product) {
		this.repository.put(product.getId(), product);
		return true;
	}
	
	public boolean remove(int id) {
		this.repository.remove(id);
		return true;
	}
	
	public Product get(int id) { //id return person
		return this.repository.get(id);
	}
}

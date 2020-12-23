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
		if(this.repository.remove(id) != null);
			return true;
		return false;
	}
	
	public Product get(int id) { //id return person
		return this.repository.get(id);
	}
}

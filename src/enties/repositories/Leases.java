package enties.repositories;

import java.util.List;
import java.util.ArrayList;


public class Leases {
    private List<Location> repository;

	public Leases() {
		this.repository = new ArrayList<Location>();
	}
	
	public boolean add(Allocation allocation) {
		return this.repository.add(allocation);
	}
	
	public boolean remove(int id) {
		return this.repository.remove(id);
	}
	
	public Location get(int id) { //id return person
		return this.repository.get(id);
	}
}

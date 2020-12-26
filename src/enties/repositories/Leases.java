package enties.repositories;

import java.util.List;
import java.util.ArrayList;


public class Leases {
    private List<Location> repository;

    public Leases() {
        this.repository = new ArrayList<Location>();
    }

    public boolean add(Location location) {
        return this.repository.add(location);
    }

    public boolean remove(int id) {
        return this.repository.remove(id) != null;
    }

    public Location get(int id) { //id return person
        return this.repository.get(id);
    }

    @Override
    public String toString() {
        return "Leases[" + "repository=" + repository + "]";
    }
}

package enties.repositories;

import java.util.List;
import java.util.ArrayList;


public class Leases {
    private List<Location> repository;

    public Leases() {
        this.repository = new ArrayList<>();
    }

    public boolean add(Location location) {
        return this.repository.add(location);
    }

    public boolean remove(String codigoProduto) {
        for(Location l : repository){
            if(l.getCodigoProduto().equals(codigoProduto))
                return this.repository.remove(l);
        }
        return false;
    }

    public Location get(String codigoProduto) { 
       for(Location l : repository){
            if(l.getCodigoProduto().equals(codigoProduto))
                return l;
        }
       return null;
    }

    @Override
    public String toString() {
        return "Leases[" + "repository=" + repository + "]";
    }
}

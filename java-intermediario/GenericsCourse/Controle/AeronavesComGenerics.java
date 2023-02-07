package GenericsCourse.Controle;

import java.util.ArrayList;
import java.util.List;

public class AeronavesComGenerics <T> {
    private List<T> listaAeronaves = new ArrayList<>();

    public void addVoo(T nrVoo) {
        // listaAeronaves.add("3520");
        listaAeronaves.add(nrVoo);
    }

    public T primeiroVoo() {
        if (listaAeronaves.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return listaAeronaves.get(0);  
    }
}

package gabiruTestes.AulaTroll.repository;

import gabiruTestes.AulaTroll.domain.Armas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ArmasRepositoryIMPL implements ArmasRepository{

    private static List<Armas> listaArmas = new ArrayList<>();

    @Override
    public void save(Armas gun) {
        listaArmas.add(gun);
    }

    @Override
    public void deleteArmas(Armas gun) {
        listaArmas.remove(gun);
    }

    @Override
    public Armas getArma(int numSerie) {
        return listaArmas.stream().filter(arr -> arr.getCodSerie() == numSerie).findFirst().get();
    }

    @Override
    public List<Armas> getArmas() {
        return listaArmas;
    }
}

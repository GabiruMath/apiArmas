package gabiruTestes.AulaTroll.repository;

import gabiruTestes.AulaTroll.domain.Armas;

import java.util.List;

public interface ArmasRepository {
    void save(Armas gun);
    void deleteArmas(Armas gun);
    Armas getArma(int numSerie);
    List<Armas> getArmas();
}

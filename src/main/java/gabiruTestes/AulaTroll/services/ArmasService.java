package gabiruTestes.AulaTroll.services;

import gabiruTestes.AulaTroll.domain.Armas;
import gabiruTestes.AulaTroll.repository.ArmasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmasService {
    @Autowired
    private ArmasRepository arrRepo;

    public void saveArma(Armas gun){
        arrRepo.save(gun);
    }

    public Armas getArma(int codSerie)
    {
       return arrRepo.getArma(codSerie);
    }

    public List<Armas> getArmas()
    {
        return arrRepo.getArmas();
    }

    public void deleteArma(int codSerie){
        arrRepo.deleteArmas(getArma(codSerie));
    }

}

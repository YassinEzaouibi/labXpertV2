package com.yassin.labxpert.services;

import com.yassin.labxpert.entiys.Analyse;
import com.yassin.labxpert.entiys.Echantillon;
import com.yassin.labxpert.repository.EchantillonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EchantillonService {
    private final EchantillonRepo echantillonRepo;
    @Autowired
    public EchantillonService(EchantillonRepo echantillonRepo){
        this.echantillonRepo = echantillonRepo;
    }
    public void deleteEchantillonById(long id){
        echantillonRepo.deleteById(id);
    }
    public Echantillon addEchantillon(Echantillon echantillon){
        return echantillonRepo.save(echantillon);
    }
    public Echantillon modifierEchantillon(Echantillon updatedEchantillon){
        return echantillonRepo.save(updatedEchantillon);

    }
    public Echantillon getEchantillonById(long id){
        return echantillonRepo.findById(id).get();
    }
    public List<Echantillon> getEchantillons(){
        return echantillonRepo.findAll();
    }
}

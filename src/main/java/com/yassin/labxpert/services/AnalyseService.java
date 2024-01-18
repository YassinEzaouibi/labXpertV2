package com.yassin.labxpert.services;

import com.yassin.labxpert.entiys.Analyse;
import com.yassin.labxpert.repository.AnalyseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyseService {
    private final AnalyseRepo analyseRepo;
    @Autowired
    public AnalyseService(AnalyseRepo analyseRepo){
        this.analyseRepo = analyseRepo;
    }
    public void deleteAnalyseById(long id){
        analyseRepo.deleteById(id);
    }
    public Analyse addAnalyse(Analyse analyse){
        return analyseRepo.save(analyse);
    }
    public Analyse modifierAnalyse(Analyse updatedAnalyse){
        return analyseRepo.save(updatedAnalyse);

    }
    public Analyse getAnalyseById(long id){
        return analyseRepo.findById(id).get();
    }
    public List<Analyse> getAnalyses(){
        return analyseRepo.findAll();
    }
}

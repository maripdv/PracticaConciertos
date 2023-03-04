/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PracticaConciertos.PracticaConcierto.service;

import com.PracticaConciertos.PracticaConcierto.entity.Concierto;
import com.PracticaConciertos.PracticaConcierto.repository.ConciertoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ConciertoService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository conciertoRepository;
    
    @Override
    public List<Concierto> verConcierto() {
        return (List<Concierto>)conciertoRepository.findAll(); }
    
    
    public void guardarConcierto(Concierto concierto){
        conciertoRepository.save(concierto);
    }
    
    public void eliminarConcierto(Concierto concierto){
        conciertoRepository.delete(concierto);}
    }
    
    
    
        
    
    


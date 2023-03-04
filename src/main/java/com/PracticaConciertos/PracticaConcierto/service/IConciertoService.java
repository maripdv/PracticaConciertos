/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PracticaConciertos.PracticaConcierto.service;

import com.PracticaConciertos.PracticaConcierto.entity.Concierto;
import java.util.List;

/**
 *
 * @author mpaul
 */
public interface IConciertoService {
    
public List<Concierto> verConcierto();   
public void guardarConcierto(Concierto concierto);
public void eliminarConcierto(Concierto concierto); 

}

package com.cibertec.Profesores.services;

import com.cibertec.Profesores.model.Profesores;

import java.util.List;


public interface IProfesoresServices {
    List<Profesores> GetAllProfesores();
    Profesores SaveProfesores(Profesores entity);
    Profesores FindProfesoresById(int id);
    void DeleteProfesoresById(int id);
    void UpdateProfesor(int id, Profesores profesorUpdate);
}

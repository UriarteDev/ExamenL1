package com.cibertec.Profesores.rest;


import com.cibertec.Profesores.model.Profesores;
import com.cibertec.Profesores.services.IProfesoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// PRINCIPAL (LO QUE SE EXPONE)
@RestController
public class ProfesoresController {

    /*
    * Consultar => GET
    * Grabar => POST
    * Actualizar => PUT(*) / PATCH
    * Eliminar => DELETE
    * */
    IProfesoresServices ProfesoresServices;

    @Autowired
    public ProfesoresController(IProfesoresServices profesoresServices) {

        this.ProfesoresServices=profesoresServices;
    }

    @GetMapping("/profesores")
    public List<Profesores> getAll() {

        return ProfesoresServices.GetAllProfesores();
    }

    @GetMapping("/profesor/{id}")
    public Profesores getAll(@PathVariable int id) {
        return ProfesoresServices.FindProfesoresById(id);
    }

    @PostMapping("/profesores")
    public Profesores SaveProfesores(@RequestBody Profesores entity) {

        return ProfesoresServices.SaveProfesores(entity);
    }
    @DeleteMapping("/profesorD/{id}")
    public void DeleteProfesoresById (@PathVariable int id) {
        ProfesoresServices.DeleteProfesoresById(id);
    }

    @PutMapping("/profesorU/{id}")
    public void UpdateProfesor(@PathVariable int id, @RequestBody Profesores profesorUpdate) {
        ProfesoresServices.UpdateProfesor(id, profesorUpdate);
    }
}

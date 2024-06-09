package com.cibertec.Profesores.services.Impl;

import com.cibertec.Profesores.model.Profesores;
import com.cibertec.Profesores.repository.IProfesoresRepository;
import com.cibertec.Profesores.services.IProfesoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// LOGICA DE NEGOCIO (VALIDACIONES; CONVERTIR OBJETOS, PROCESAR INFORMACION)
@Service
public class ProfesoresServices implements IProfesoresServices {

    IProfesoresRepository _profesorRepository;

    @Autowired
    public ProfesoresServices(IProfesoresRepository profesorRepository) {

        _profesorRepository = profesorRepository;
    }


    @Override
    public List<Profesores> GetAllProfesores() {

        return _profesorRepository.findAll();
    }

    @Override
    public Profesores SaveProfesores(Profesores entity) {
        Profesores profesoresSaved = _profesorRepository.save(entity);
        return profesoresSaved;
    }

    @Override
    public Profesores FindProfesoresById(int id) {
        Optional<Profesores> rowInDB = _profesorRepository.findById(id);
        return rowInDB.orElseGet(Profesores::new);
    }

    @Override
    public void DeleteProfesoresById(int id) {
        _profesorRepository.deleteById(id);
    }
    @Override
    public void UpdateProfesor(int id, Profesores profesorUpdate) {
        Profesores profesorExist = _profesorRepository.findById(id).orElse(null);

        if (profesorExist != null) {
            profesorExist.setName(profesorUpdate.getName());
            profesorExist.setAge(profesorUpdate.getAge());
            profesorExist.setDNI(profesorUpdate.getDNI());
            _profesorRepository.save(profesorExist);
        }
    }
}

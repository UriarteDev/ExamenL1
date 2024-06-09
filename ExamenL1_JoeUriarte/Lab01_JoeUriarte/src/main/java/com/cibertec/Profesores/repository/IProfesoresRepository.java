package com.cibertec.Profesores.repository;

import com.cibertec.Profesores.model.Profesores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesoresRepository extends JpaRepository<Profesores, Integer> {
}

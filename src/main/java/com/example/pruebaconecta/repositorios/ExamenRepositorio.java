package com.example.pruebaconecta.repositorios;

import com.example.pruebaconecta.entidades.Examen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamenRepositorio extends JpaRepository<Examen,Integer> {
}

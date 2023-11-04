package com.example.pruebaconecta.repositorios;

import com.example.pruebaconecta.entidades.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignoVitalRepositorio  extends JpaRepository <SignoVital,Integer> {
}

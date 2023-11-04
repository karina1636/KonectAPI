package com.example.pruebaconecta.repositorios;

import com.example.pruebaconecta.entidades.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliadoRepositorio extends JpaRepository <Afiliado,Integer>  {
}

package com.example.pruebaconecta.servicios;

import com.example.pruebaconecta.entidades.Examen;
import com.example.pruebaconecta.repositorios.ExamenRepositorio;
import com.example.pruebaconecta.util.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenServicio {
    @Autowired
    ExamenRepositorio examenRepositorio;

    //RegistrarAfiliado
    public Examen registrarExamen(Examen examen) throws  Exception{
        try{

            return this.examenRepositorio.save(examen);

        }catch(Exception error){
            throw new Exception(Mensajes.ERROR_REGISTRO.getMensajes());
        }

    }
    
}

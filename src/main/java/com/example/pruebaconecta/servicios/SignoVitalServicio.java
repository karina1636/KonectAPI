package com.example.pruebaconecta.servicios;

import com.example.pruebaconecta.entidades.SignoVital;
import com.example.pruebaconecta.repositorios.SignoVitalRepositorio;
import com.example.pruebaconecta.util.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignoVitalServicio {
    @Autowired

    SignoVitalRepositorio signoVitalRepositorio;


    public SignoVital registrarSignoVital(SignoVital signoVital) throws  Exception{
        try{

            return this.signoVitalRepositorio.save(signoVital);

        }catch(Exception error){
            throw new Exception(Mensajes.ERROR_REGISTRO.getMensajes());
        }

    }
}

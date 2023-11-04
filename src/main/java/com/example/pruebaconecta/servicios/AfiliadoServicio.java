package com.example.pruebaconecta.servicios;

import com.example.pruebaconecta.entidades.Afiliado;
import com.example.pruebaconecta.repositorios.AfiliadoRepositorio;
import com.example.pruebaconecta.util.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AfiliadoServicio {
    @Autowired
    AfiliadoRepositorio afiliadoRepositorio;

    //RegistrarAfiliado
    public Afiliado registrarAfiliado(Afiliado afiliado) throws Exception {
        try {

            return this.afiliadoRepositorio.save(afiliado);

        } catch (Exception error) {
            throw new Exception(Mensajes.ERROR_REGISTRO.getMensajes());
        }

    }

    //consultarAfiliado

    public Afiliado consultarAfiliado(Integer idAfiliado) throws Exception {
        try {

            Optional<Afiliado> afiliadoBuscado = this.afiliadoRepositorio.findById(idAfiliado);
            if (afiliadoBuscado.isPresent()) {//lo encontre en BD
                return afiliadoBuscado.get();

            } else {//no lo encontra

                throw new Exception(Mensajes.AFILIADO_NO_ENCONTRADO.getMensajes());
            }

        } catch (Exception error) {
            throw new Exception(Mensajes.ERROR_CONSULTA.getMensajes());
        }
    }
    //ModificarDatosAfiliado
    // BorrarAfiliado
}

package com.example.pruebaconecta.util;

public enum Mensajes {

    ERROR_REGISTRO("Error al registrarse"),
    ERROR_CONSULTA("Error en la consulta del afiliado"),
    AFILIADO_NO_ENCONTRADO("Afiliado no encontrado");
    private  String Mensajes;

    Mensajes(String mensajes) {
        Mensajes = mensajes;
    }

    public String getMensajes() {
        return Mensajes;
    }

    public void setMensajes(String mensajes) {
        Mensajes = mensajes;
    }
}
package com.example.pruebaconecta.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity    //
@Table(name = "afiliados")  // aca se crea la tabla

public class Afiliado {


    @Id  // se crea la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // para que sea autoincrementable
    @Column(name = "id", nullable = false)  //el nullable es como decir not null, que no puede quedar vacio
    private Integer id;
    @Column(name = "nombres", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellidos", length = 50, nullable = false)
    private String apellido;
    @Column(name = "documentos", length = 12, nullable = false)
    private String documento;
    @Column(name = "correo", nullable = false)
    private String correo;
    @Column(name = "departamento", nullable = false)
    private Integer departamento;
    @Column(name = "ciudad", nullable = false)
    private Integer ciudad;
    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;
    @Column(name = "nacimiento", nullable = false)
    private LocalDate fechaNacimiento;

    public Afiliado() {
    }

    public Afiliado(Integer id, String nombre, String apellido, String documento, String correo, Integer departamento, Integer ciudad, String telefono, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.correo = correo;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Integer departamento) {
        this.departamento = departamento;
    }

    public Integer getCiudad() {
        return ciudad;
    }

    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

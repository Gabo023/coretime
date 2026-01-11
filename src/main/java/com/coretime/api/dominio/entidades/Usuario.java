package com.coretime.api.dominio.entidades;

public final class Usuario {
    
    private final Long id;
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String password; 
    private final Boolean estado; // ESTADO DEL USUARIO DETERMINA SI EL EMPLEADO TIENE CONTRATO ACTIVO O NO

    public Usuario(Long id, String nombre, String apellido, String email, String password, Boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.password = password;
        this.estado = estado;
    }

    // SOLO GETTERS PARA LA PROTECCION DE LOS DATOS
    public Long getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public Boolean getEstado() { return estado; }
}
package edu.componentes.TallerMolina.modelo;

public class Tarea {
    private Long id;
    private String titulo;
    private String descripcion;
    private String estado; // "pendiente" o "completada"
    
    // Constructores
    public Tarea() {}
    
    public Tarea(Long id, String titulo, String descripcion, String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Auditoria;
import java.time.LocalDate;
import java.util.Date;

public class Auditoria {
    private int id;
    private Date fechaCreacion;
    private Estado estado;
    private String responsable;
    private String descripcion;

    public Auditoria(int id, Date minusDays, Estado estado, String responsable, String descripcion) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.responsable = responsable;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Auditoria{" +
                "id=" + id +
                ", fechaCreacion=" + fechaCreacion +
                ", estado=" + estado +
                ", responsable='" + responsable + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

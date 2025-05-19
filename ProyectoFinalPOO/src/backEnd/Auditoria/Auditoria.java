package backEnd.Auditoria;

import java.io.Serializable;
import java.time.LocalDate;

public class Auditoria implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private LocalDate fechaCreacion;
    private Estado estado;
    private String responsable;
    private String descripcion;

    public Auditoria(int id, LocalDate fechaCreacion, Estado estado, String responsable, String descripcion) {
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
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
    return String.format(
        "ID: %d | Fecha: %s | Estado: %s | Responsable: %s | Descripción: %s",
        id,
        fechaCreacion,
        estado,
        responsable,
        descripcion
    );
}

}

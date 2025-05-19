/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Denuncias;

/**
 *
 * @author DANIEL
 */
public class Denuncias {
    private String nomEmpresa;
    private String descripcion;
    private String correo;
    private String infracciones;

    public Denuncias(String nomEmpresa, String descripcion, String correo, String infracciones) {
        this.nomEmpresa = nomEmpresa;
        this.descripcion = descripcion;
        this.correo = correo;
        this.infracciones = infracciones;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getInfracciones() {
        return infracciones;
    }

    public void setInfracciones(String infracciones) {
        this.infracciones = infracciones;
    }

@Override
public String toString() {
    return nomEmpresa + " | " + descripcion + " | " + correo + " | " + infracciones;
}

    
    
    
    
    
}

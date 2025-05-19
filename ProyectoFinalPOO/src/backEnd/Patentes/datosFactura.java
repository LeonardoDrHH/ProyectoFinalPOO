/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Patentes;

import java.util.Date;

public class datosFactura {
    private String nomSolicitante;
    private String nomPro;
    private String descripcionTec;
    private Date fecha;
    private String hora;
    private String rfc;
    private String correo;
    private String telefono;
    private double total;

    // Getters y Setters
    public String getNomSolicitante() { return nomSolicitante; }
    public void setNomSolicitante(String nomSolicitante) { this.nomSolicitante = nomSolicitante; }

    public String getNomPro() { return nomPro; }
    public void setNomPro(String nomPro) { this.nomPro = nomPro; }

    public String getDescripcionTec() { return descripcionTec; }
    public void setDescripcionTec(String descripcionTec) { this.descripcionTec = descripcionTec; }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getRfc() { return rfc; }
    public void setRfc(String rfc) { this.rfc = rfc; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }
}

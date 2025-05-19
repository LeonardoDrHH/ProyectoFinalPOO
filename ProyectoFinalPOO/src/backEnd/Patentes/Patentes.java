/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Patentes;

import java.util.Date;

/**
 *
 * @author DANIEL
 */
public class Patentes {
    private String nomPro;
    String descripcionTec;
    String nomSolicitante;
    private Date fechaSoli;

    public Patentes(String nomPro, String descripcionTec, String nomSolicitante, Date fechaSoli) {
        this.nomPro = nomPro;
        this.descripcionTec = descripcionTec;
        this.nomSolicitante = nomSolicitante;
        this.fechaSoli = fechaSoli;
    }



    public String getNomPro() {
        return nomPro;
    }

    public void setNomPro(String nomPro) {
        this.nomPro = nomPro;
    }

    public String getDescripcionTec() {
        return descripcionTec;
    }

    public void setDescripcionTec(String descripcionTec) {
        this.descripcionTec = descripcionTec;
    }

    public String getNomSolicitante() {
        return nomSolicitante;
    }

    public void setNomSolicitante(String nomSolicitante) {
        this.nomSolicitante = nomSolicitante;
    }

    public Date getFechaSoli() {
        return fechaSoli;
    }

    public void setFechaSoli(Date fechaSoli) {
        this.fechaSoli = fechaSoli;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patentes{");
        sb.append("nomPro=").append(nomPro);
        sb.append(", descripcionTec=").append(descripcionTec);
        sb.append(", nomSolicitante=").append(nomSolicitante);
        sb.append(", Fecha Solicitud=").append(fechaSoli);
        sb.append('}');
        return sb.toString();
    }

    
    
}

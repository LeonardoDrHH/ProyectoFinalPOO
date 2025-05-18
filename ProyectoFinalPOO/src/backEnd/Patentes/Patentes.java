/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Patentes;

/**
 *
 * @author DANIEL
 */
public class Patentes {
    private String nomPro;
    private String descripcionTec;
    private String nomSolicitante;

    public Patentes(String nomPro, String descripcionTec, String nomSolicitante) {
        this.nomPro = nomPro;
        this.descripcionTec = descripcionTec;
        this.nomSolicitante = nomSolicitante;
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
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Patentes{");
        sb.append("nomPro=").append(nomPro);
        sb.append(", descripcionTec=").append(descripcionTec);
        sb.append(", nomSolicitante=").append(nomSolicitante);
        sb.append('}');
        return sb.toString();
    }

    
    
}

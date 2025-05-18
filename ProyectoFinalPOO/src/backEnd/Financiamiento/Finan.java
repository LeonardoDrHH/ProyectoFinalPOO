/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Financiamiento;

/**
 *
 * @author DANIEL
 */
public class Finan {
    private String nomEmpresa;
    private String nomProyec;
    private double monto;

    public Finan(String nomEmpresa, String nomProyec, double monto) {
        this.nomEmpresa = nomEmpresa;
        this.nomProyec = nomProyec;
        this.monto = monto;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getNomProyec() {
        return nomProyec;
    }

    public void setNomProyec(String nomProyec) {
        this.nomProyec = nomProyec;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "Finan{" + "nomEmpresa=" + nomEmpresa + ", nomProyec=" + nomProyec + ", monto=" + monto + '}';
    }
    
    
    
}

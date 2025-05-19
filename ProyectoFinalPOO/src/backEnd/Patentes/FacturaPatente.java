/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Patentes;

import java.util.Date;

/**
 *
 * @author lrobl
 */
public class FacturaPatente extends Patentes {
    private static int contador = 1;
    private int numeroFactura;
    private String horaFactura;
    private String nombreSolicitante;
    private String nombreProducto;
    private String descripcionTecnica;

    public FacturaPatente(String nomPro, String descripcionTec, String nomSolicitante, Date fechaSoli) {
        super(nomPro, descripcionTec, nomSolicitante, fechaSoli);
    }

    public FacturaPatente(int numeroFactura, String horaFactura, String nombreSolicitante, String nombreProducto, String descripcionTecnica, String nomPro, String descripcionTec, String nomSolicitante, Date fechaSoli) {
        super(nomPro, descripcionTec, nomSolicitante, fechaSoli);
        this.numeroFactura = numeroFactura;
        this.horaFactura = horaFactura;
        this.nombreSolicitante = nombreSolicitante;
        this.nombreProducto = nombreProducto;
        this.descripcionTecnica = descripcionTecnica;
    }
    
    



    
    public String getHoraFactura() {
        return horaFactura;
    }

    public void setHoraFactura(String horaFactura) {
        this.horaFactura = horaFactura;
    }

    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        FacturaPatente.contador = contador;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionTecnica() {
        return descripcionTecnica;
    }

    public void setDescripcionTecnica(String descripcionTecnica) {
        this.descripcionTecnica = descripcionTecnica;
    }

    @Override
    public String toString() {
        return "FacturaPatente{" +
                "\n Número de factura: " + numeroFactura +
                "\n Hora de factura: " + horaFactura +
                "\n Nombre solicitante: " + nombreSolicitante +
                "\n Nombre producto: " + nombreProducto +
                "\n Descripcion tecnica: " + descripcionTecnica +
                "\n" + '}';
    }
    
    
}

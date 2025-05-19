/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package backEnd.Patentes;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FacturaPatente extends Patentes {
    private static int contador = 1;
    private int numeroFactura;
    private String horaFactura;
    private String RFC;
    private String correo;
    private String numTele;
    private double costoTotal;

    public FacturaPatente(int numeroFactura, String horaFactura, String RFC, String correo, String numTele, double costoTotal, String nomPro, String descripcionTec, String nomSolicitante, Date fechaSoli) {
        super(nomPro, descripcionTec, nomSolicitante, fechaSoli);
        this.numeroFactura = numeroFactura;
        this.horaFactura = horaFactura;
        this.RFC = RFC;
        this.correo = correo;
        this.numTele = numTele;
        this.costoTotal = costoTotal;
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

    public String getHoraFactura() {
        return horaFactura;
    }

    public void setHoraFactura(String horaFactura) {
        this.horaFactura = horaFactura;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTele() {
        return numTele;
    }

    public void setNumTele(String numTele) {
        this.numTele = numTele;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }
    
    private String obtenerHoraActual() {
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        return formatoHora.format(new Date());
    }

    @Override
    public Date getFechaSoli() {
        System.out.println("Fecha de solicitud con hora: " + super.getFechaSoli() + " " + horaFactura);
        return super.getFechaSoli();
    }

    @Override
    public String toString() {
        return "FacturaPatente{" + "numeroFactura=" + numeroFactura + ", horaFactura=" + horaFactura + ", RFC=" + RFC + ", correo=" + correo + ", numTele=" + numTele + ", costoTotal=" + costoTotal + '}';
    }


}
    
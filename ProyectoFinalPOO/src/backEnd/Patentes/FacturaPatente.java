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

    public FacturaPatente(String nomPro, String descripcionTec, String nomSolicitante) {
        super(nomPro, descripcionTec, nomSolicitante, new Date()); // Genera automáticamente la fecha actual
        this.numeroFactura = contador++; 
        this.horaFactura = obtenerHoraActual(); // Captura la hora actual
        
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
        return "FacturaPatente{" +
                "\n Número de factura: " + numeroFactura +
                "\n Fecha y hora de solicitud: " + super.getFechaSoli() + " " + horaFactura +
                "\n Nombre solicitante: " + getNomSolicitante() +
                "\n Nombre producto: " + getNomPro() +
                "\n Descripción técnica: " + getDescripcionTec() +
                "\n" + '}';
    }
}
    
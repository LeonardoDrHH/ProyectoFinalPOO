package backEnd.Patentes;

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

    public FacturaPatente(Patentes datosBase, int contador1, String nomPro, String descripcionTec, String nomSolicitante, String RFC, double costoTotal, String correo, String numTele, String nomSolicitante1, Date fechaSoli) {
        super(nomPro, descripcionTec, nomSolicitante, fechaSoli);
        this.numeroFactura = contador++;
        this.horaFactura = obtenerHoraActual();
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

    public String getHoraFactura() {
        return horaFactura;
    }

    public String getRFC() {
        return RFC;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNumTele() {
        return numTele;
    }

    public double getCostoTotal() {
        return costoTotal;
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
                "numeroFactura=" + numeroFactura +
                ", horaFactura='" + horaFactura + '\'' +
                ", RFC='" + RFC + '\'' +
                ", correo='" + correo + '\'' +
                ", numTele='" + numTele + '\'' +
                ", costoTotal=" + costoTotal +
                ", nomPro='" + getNomPro() + '\'' +
                ", descripcionTec='" + getDescripcionTec() + '\'' +
                ", nomSolicitante='" + getNomSolicitante() + '\'' +
                ", fechaSoli=" + getFechaSoli() +
                '}';
    }
}

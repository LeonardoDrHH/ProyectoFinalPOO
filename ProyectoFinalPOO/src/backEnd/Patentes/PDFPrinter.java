/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Patentes;

import java.awt.*;
import java.awt.print.*;
import javax.swing.*;

public class PDFPrinter implements Printable {

    private final datosFactura datosFactura;

    public PDFPrinter(datosFactura datosFactura) {
        this.datosFactura = datosFactura;
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        int y = 20;
        g.drawString("FACTURA DE PATENTE", 100, y); y += 30;
        g.drawString("Solicitante: " + datosFactura.getNomSolicitante(), 50, y); y += 20;
        g.drawString("Producto: " + datosFactura.getNomPro(), 50, y); y += 20;
        g.drawString("Descripción: " + datosFactura.getDescripcionTec(), 50, y); y += 20;
        g.drawString("Fecha: " + datosFactura.getFecha().toString(), 50, y); y += 20;
        g.drawString("Hora: " + datosFactura.getHora(), 50, y); y += 20;
        g.drawString("RFC: " + datosFactura.getRfc(), 50, y); y += 20;
        g.drawString("Correo: " + datosFactura.getCorreo(), 50, y); y += 20;
        g.drawString("Teléfono: " + datosFactura.getTelefono(), 50, y); y += 20;
        g.drawString("Total: $" + datosFactura.getTotal(), 50, y);

        return PAGE_EXISTS;
    }

    public void imprimirComoPDF() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this);

        boolean doPrint = job.printDialog();
        if (doPrint) {
            try {
                job.print();
                JOptionPane.showMessageDialog(null, "Factura enviada a imprimir.");
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Error al imprimir: " + e.getMessage());
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package backEnd.MainPruebas;


import backEnd.Auditoria.AdminRegistro;
import backEnd.Auditoria.Auditoria;
import backEnd.Auditoria.Estado;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public class Main {

    public static void main(String[] args) {

        AdminRegistro admin = new AdminRegistro();

        // Crear algunos objetos de prueba
        Auditoria a1 = new Auditoria(1, new Date(), Estado.Pendientes, "Carlos", "Revisión de equipos");
        Auditoria a2 = new Auditoria(2, new Date(), Estado.Aprobadas, "Lucía", "Verificación de procesos");
        Auditoria a3 = new Auditoria(3, new Date(), Estado.Pendientes, "María", "Control de calidad");

        // Agregar al registro
        admin.agregar(a1);
        admin.agregar(a2);
        admin.agregar(a3);

        // Mostrar todas las auditorías
        System.out.println("Lista completa:");
        for (Auditoria a : admin.listar()) {
            System.out.println(a);
        }

        // Buscar por ID
        System.out.println("\nBuscar ID 2:");
        Auditoria buscada = admin.buscarPorId(2);
        if (buscada != null) {
            System.out.println(buscada);
        }

        // Actualizar una auditoría
        Auditoria nuevaInfo = new Auditoria(2, new Date(), Estado.Rechazadas, "Lucía", "Proceso fallido");
        admin.actualizar(2, nuevaInfo);

        // Filtrar por estado
        System.out.println("\nFiltrar por estado PENDIENTE:");
        List<Auditoria> pendientes = admin.filtrarPorEstado(Estado.Pendientes);
        for (Auditoria a : pendientes) {
            System.out.println(a);
        }

        // Eliminar una auditoría
        admin.eliminar(1);

        // Mostrar después de eliminar
        System.out.println("\nDespués de eliminar ID 1:");
        for (Auditoria a : admin.listar()) {
            System.out.println(a);
        }
    }
}

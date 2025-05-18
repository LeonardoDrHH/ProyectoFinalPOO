

package backEnd.MainPruebas;

import backEnd.Auditoria.AdminAuditoria;
import backEnd.Auditoria.Auditoria;
import backEnd.Auditoria.Estado;
import java.time.LocalDate;

public class MainPruebaAudi {

    public static void main(String[] args) {
        // Creamos una clase concreta an�nima porque AdminAuditoria es abstracta
        AdminAuditoria admin = new AdminAuditoria() {
            @Override
            public Auditoria buscarPorId(int id) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        // Crear auditor�as
        Auditoria a1 = new Auditoria(1, "Proyecto Genoma", "Juan P�rez", Estado.Pendientes, LocalDate.now());
        Auditoria a2 = new Auditoria(2, "Bioensayos", "Mar�a L�pez", Estado.Aprobadas, LocalDate.now().minusDays(2));

        // Agregar
        System.out.println(admin.agregar(a1));
        System.out.println(admin.agregar(a2));

        // Listar
        System.out.println("\nLista de auditor�as:");
        for (Auditoria a : admin.listar()) {
            System.out.println(a);
        }

        // Actualizar
        Auditoria aModificada = new Auditoria(2, "Bioensayos Modificado", "Mar�a L�pez", Estado.Rechazadas, LocalDate.now());
        boolean actualizado = admin.actualizar(1, aModificada);
        System.out.println("\nActualizado �ndice 1: " + actualizado);

        // Listar despu�s de actualizar
        System.out.println("\nLista despu�s de actualizar:");
        for (Auditoria a : admin.listar()) {
            System.out.println(a);
        }

        // Eliminar
        boolean eliminado = admin.eliminar(0);
        System.out.println("\nEliminado �ndice 0: " + eliminado);

        // Listar despu�s de eliminar
        System.out.println("\nLista despu�s de eliminar:");
        for (Auditoria a : admin.listar()) {
            System.out.println(a);
        }

        // Filtrar por estado
        System.out.println("\nFiltrar por estado RECHAZADO:");
        for (Auditoria a : admin.filtrarPorEstado(Estado.Rechazadas)) {
            System.out.println(a);
        }
    }
}

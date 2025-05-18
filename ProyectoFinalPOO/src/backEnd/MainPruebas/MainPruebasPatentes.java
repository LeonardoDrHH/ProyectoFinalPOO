package backEnd.MainPruebas;

import backEnd.Patentes.AdminPatentes;
import backEnd.Patentes.Patentes;

public class MainPruebasPatentes {
    public static void main(String[] args) {
        // Instancia anónima de AdminPatentes
        AdminPatentes admin = new AdminPatentes() {
            @Override
            public Patentes buscarPorId(int id) {
                return null;
            }
        };
        
        // Crear patentes
        Patentes p1 = new Patentes("Proyecto A", "Descripción técnica A", "Solicitante 1");
        Patentes p2 = new Patentes("Proyecto B", "Descripción técnica B", "Solicitante 2");
        
        // Agregar patentes
        System.out.println(admin.agregar(p1));
        System.out.println(admin.agregar(p2));
        
        // Listar todas las patentes
        System.out.println("\nLista de Patentes:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
        
        // Actualizar patente índice 0
        Patentes pModificada = new Patentes("Proyecto A modificado", "Nueva descripción técnica", "Solicitante X");
        boolean actualizado = admin.actualizar(0, pModificada);
        System.out.println("\nActualización índice 0: " + actualizado);
        
        // Listar después de actualizar
        System.out.println("\nLista después de actualizar:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
        
        // Eliminar patente índice 1
        boolean eliminado = admin.eliminar(1);
        System.out.println("\nEliminado índice 1: " + eliminado);
        
        // Listar después de eliminar
        System.out.println("\nLista después de eliminar:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
    }
}

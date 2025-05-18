package backEnd.MainPruebas;

import backEnd.Patentes.AdminPatentes;
import backEnd.Patentes.Patentes;

public class MainPruebasPatentes {
    public static void main(String[] args) {
        // Instancia an�nima de AdminPatentes
        AdminPatentes admin = new AdminPatentes() {
            @Override
            public Patentes buscarPorId(int id) {
                return null;
            }
        };
        
        // Crear patentes
        Patentes p1 = new Patentes("Proyecto A", "Descripci�n t�cnica A", "Solicitante 1");
        Patentes p2 = new Patentes("Proyecto B", "Descripci�n t�cnica B", "Solicitante 2");
        
        // Agregar patentes
        System.out.println(admin.agregar(p1));
        System.out.println(admin.agregar(p2));
        
        // Listar todas las patentes
        System.out.println("\nLista de Patentes:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
        
        // Actualizar patente �ndice 0
        Patentes pModificada = new Patentes("Proyecto A modificado", "Nueva descripci�n t�cnica", "Solicitante X");
        boolean actualizado = admin.actualizar(0, pModificada);
        System.out.println("\nActualizaci�n �ndice 0: " + actualizado);
        
        // Listar despu�s de actualizar
        System.out.println("\nLista despu�s de actualizar:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
        
        // Eliminar patente �ndice 1
        boolean eliminado = admin.eliminar(1);
        System.out.println("\nEliminado �ndice 1: " + eliminado);
        
        // Listar despu�s de eliminar
        System.out.println("\nLista despu�s de eliminar:");
        for (Patentes p : admin.listar()) {
            System.out.println(p);
        }
    }
}

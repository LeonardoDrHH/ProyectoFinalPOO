package backEnd.MainPruebas;

import backEnd.Denuncias.Denuncias;
import backEnd.Denuncias.AdminDenuncias;


public class MainPruebasDenuncias {

    public static void main(String[] args) {
        // Creamos una clase an�nima porque AdminDenuncias debe ser abstracta (igual que AdminAuditoria)
        AdminDenuncias admin = new AdminDenuncias() {};

        // Crear algunas denuncias
        Denuncias d1 = new Denuncias("Empresa XYZ", "Descripci�n 1", "contacto@xyz.com", "Infracci�n A");
        Denuncias d2 = new Denuncias("Empresa ABC", "Descripci�n 2", "info@abc.com", "Infracci�n B");

        // Agregar denuncias
        System.out.println(admin.agregar(d1));
        System.out.println(admin.agregar(d2));

        // Listar denuncias
        System.out.println("\nLista de denuncias:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }

        // Actualizar denuncia en �ndice 0
        Denuncias dModificada = new Denuncias("Empresa XYZ Modificada", "Descripci�n actualizada", "nuevo@xyz.com", "Infracci�n C");
        boolean actualizado = admin.actualizar(0, dModificada);
        System.out.println("\nActualizado �ndice 0: " + actualizado);

        // Listar despu�s de actualizar
        System.out.println("\nLista despu�s de actualizar:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }

        // Eliminar denuncia en �ndice 1
        boolean eliminado = admin.eliminar(1);
        System.out.println("\nEliminado �ndice 1: " + eliminado);

        // Listar despu�s de eliminar
        System.out.println("\nLista despu�s de eliminar:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }
    }
}

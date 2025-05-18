package backEnd.MainPruebas;

import backEnd.Denuncias.Denuncias;
import backEnd.Denuncias.AdminDenuncias;


public class MainPruebasDenuncias {

    public static void main(String[] args) {
        // Creamos una clase anónima porque AdminDenuncias debe ser abstracta (igual que AdminAuditoria)
        AdminDenuncias admin = new AdminDenuncias() {};

        // Crear algunas denuncias
        Denuncias d1 = new Denuncias("Empresa XYZ", "Descripción 1", "contacto@xyz.com", "Infracción A");
        Denuncias d2 = new Denuncias("Empresa ABC", "Descripción 2", "info@abc.com", "Infracción B");

        // Agregar denuncias
        System.out.println(admin.agregar(d1));
        System.out.println(admin.agregar(d2));

        // Listar denuncias
        System.out.println("\nLista de denuncias:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }

        // Actualizar denuncia en índice 0
        Denuncias dModificada = new Denuncias("Empresa XYZ Modificada", "Descripción actualizada", "nuevo@xyz.com", "Infracción C");
        boolean actualizado = admin.actualizar(0, dModificada);
        System.out.println("\nActualizado índice 0: " + actualizado);

        // Listar después de actualizar
        System.out.println("\nLista después de actualizar:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }

        // Eliminar denuncia en índice 1
        boolean eliminado = admin.eliminar(1);
        System.out.println("\nEliminado índice 1: " + eliminado);

        // Listar después de eliminar
        System.out.println("\nLista después de eliminar:");
        for (Denuncias d : admin.listar()) {
            System.out.println(d);
        }
    }
}

package backEnd.MainPruebas;

import backEnd.Denuncias.Denuncias;
import backEnd.Denuncias.AdminDenuncias;


public class MainPruebasDenuncias {

    public static void main(String[] args) {
        // Creamos una clase an�nima porque AdminDenuncias debe ser abstracta (igual que AdminAuditoria)
        AdminDenuncias admin = new AdminDenuncias() {
            public Denuncias buscarPorId(int id) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };

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

    }
}

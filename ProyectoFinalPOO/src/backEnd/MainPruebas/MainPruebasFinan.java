package backEnd.MainPruebas;

import backEnd.Financiamiento.AdminFinan;
import backEnd.Financiamiento.Finan;

public class MainPruebasFinan {

    public static void main(String[] args) {
        // Clase an�nima concreta para AdminFinan (si la declaraste abstracta)
        AdminFinan admin = new AdminFinan() {
            // Puedes agregar m�todos extra si quieres, o dejar as� si no hay abstractos
            @Override
            public Finan buscarPorId(int id) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };

        // Crear objetos Finan
        Finan f1 = new Finan("Empresa A", "Proyecto Alpha", 100000.0);
        Finan f2 = new Finan("Empresa B", "Proyecto Beta", 250000.5);
        Finan f3 = new Finan("Empresa C", "Proyecto Gamma", 50000.0);

        // Agregar
        System.out.println(admin.agregar(f1));
        System.out.println(admin.agregar(f2));
        System.out.println(admin.agregar(f3));

        // Listar
        System.out.println("\nLista de financiamientos:");
        for (Finan f : admin.listar()) {
            System.out.println(f);
        }

        // Actualizar
        Finan actualizado = new Finan("Empresa B", "Proyecto Beta Modificado", 300000.0);
        boolean actualizadoOk = admin.actualizar(1, actualizado);
        System.out.println("\nActualizado �ndice 1: " + actualizadoOk);

        // Listar despu�s de actualizar
        System.out.println("\nLista despu�s de actualizar:");
        for (Finan f : admin.listar()) {
            System.out.println(f);
        }

        // Eliminar
        boolean eliminado = admin.eliminar(0);
        System.out.println("\nEliminado �ndice 0: " + eliminado);

        // Listar despu�s de eliminar
        System.out.println("\nLista despu�s de eliminar:");
        for (Finan f : admin.listar()) {
            System.out.println(f);
        }
    }
}

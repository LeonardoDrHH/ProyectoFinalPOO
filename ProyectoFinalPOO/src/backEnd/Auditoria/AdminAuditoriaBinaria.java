package backEnd.Auditoria;

import java.io.*;
import java.util.List;

public class AdminAuditoriaBinaria extends AdminAuditoria {

    private final String archivo = "auditorias.dat";

    public AdminAuditoriaBinaria() {
        cargarDesdeArchivo();
    }

    @Override
    public String agregar(Auditoria obj) {
        super.agregar(obj);
        guardarEnArchivo();
        return "Auditoría agregada y guardada.";
    }

    @Override
    public boolean actualizar(int index, Auditoria nuevoObj) {
        boolean exito = super.actualizar(index, nuevoObj);
        if (exito) guardarEnArchivo();
        return exito;
    }

    @Override
    public boolean eliminar(int index) {
        boolean exito = super.eliminar(index);
        if (exito) guardarEnArchivo();
        return exito;
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error guardando auditorías: " + e.getMessage());
        }
    }

    private void cargarDesdeArchivo() {
        File f = new File(archivo);
        if (!f.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (List<Auditoria>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error cargando auditorías: " + e.getMessage());
        }
    }

    @Override
    public Auditoria buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

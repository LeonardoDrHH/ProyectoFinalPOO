package backEnd.Auditoria;

import backEnd.CRUD.Create;
import backEnd.CRUD.Read;
import backEnd.CRUD.Update;
import backEnd.CRUD.Delete;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AdminAuditoria implements Create<Auditoria>, Read<Auditoria>, Update<Auditoria>, Delete {

    protected List<Auditoria> lista = new ArrayList<>();
    private final String archivo = "auditorias.dat";

    public AdminAuditoria() {
        cargarArchivo();
    }

    @Override
    public String agregar(Auditoria obj) {
        lista.add(obj);
        guardarArchivo();
        return "Auditoría agregada: " + obj.toString();
    }

    @Override
    public List<Auditoria> listar() {
        return lista;
    }

    @Override
    public boolean actualizar(int index, Auditoria nuevoObj) {
        if (index >= 0 && index < lista.size()) {
            lista.set(index, nuevoObj);
            guardarArchivo();
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            guardarArchivo();
            return true;
        }
        return false;
    }

    public List<Auditoria> filtrarPorEstado(Estado estado) {
        List<Auditoria> resultado = new ArrayList<>();
        for (Auditoria a : lista) {
            if (a.getEstado() == estado) {
                resultado.add(a);
            }
        }
        return resultado;
    }

    // Este método es opcional si necesitas exponer directamente la lista
    public List<Auditoria> getLista() {
        return lista;
    }

    protected void guardarArchivo() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    protected void cargarArchivo() {
        File f = new File(archivo);
        if (!f.exists()) return;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            lista = (List<Auditoria>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package backEnd.Auditoria;

import backEnd.CRUD.Create;
import backEnd.CRUD.Read;
import backEnd.CRUD.Update;
import backEnd.CRUD.Delete;

import java.util.ArrayList;
import java.util.List;

public abstract class AdminAuditoria implements Create<Auditoria>, Read<Auditoria>, Update<Auditoria>, Delete {

    protected List<Auditoria> lista = new ArrayList<>();

    @Override
    public String agregar(Auditoria obj) {
        lista.add(obj);
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
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            return true;
        }
        return false;
    }

    // Puedes sobreescribir este método en una subclase si quieres filtrar
    public List<Auditoria> filtrarPorEstado(Estado estado) {
        List<Auditoria> resultado = new ArrayList<>();
        for (Auditoria a : lista) {
            if (a.getEstado() == estado) {
                resultado.add(a);
            }
        }
        return resultado;
    }
}

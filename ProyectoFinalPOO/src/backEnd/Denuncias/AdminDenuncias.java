package backEnd.Denuncias;

import backEnd.Auditoria.Auditoria;
import backEnd.CRUD.Create;
import backEnd.CRUD.Delete;
import backEnd.CRUD.Read;
import backEnd.CRUD.Update;
import java.util.ArrayList;
import java.util.List;

public abstract class AdminDenuncias implements Create<Denuncias>, Read<Denuncias>, Update<Denuncias>, Delete {

    private List<Denuncias> lista = new ArrayList<>();
    
    // Agregar una denuncia
    public String agregar(Denuncias obj) {
        lista.add(obj);
        return "Denuncia agregada: " + obj.toString();
    }
    
    // Listar todas las denuncias
    public List<Denuncias> listar() {
        return lista;
    }
    
    // Actualizar denuncia en un índice específico
    public boolean actualizar(int index, Denuncias objActualizado) {
        if (index >= 0 && index < lista.size()) {
            lista.set(index, objActualizado);
            return true;
        }
        return false;
    }
    
    // Eliminar denuncia por índice
    public boolean eliminar(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            return true;
        }
        return false;
    }
}

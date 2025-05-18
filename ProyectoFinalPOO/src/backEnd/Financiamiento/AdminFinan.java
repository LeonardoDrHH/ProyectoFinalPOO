package backEnd.Financiamiento;

import backEnd.CRUD.Create;
import backEnd.CRUD.Read;
import backEnd.CRUD.Update;
import backEnd.CRUD.Delete;
import java.util.ArrayList;
import java.util.List;

public class AdminFinan implements Create<Finan>, Read<Finan>, Update<Finan>, Delete {
    
    private List<Finan> lista = new ArrayList<>();
    
    @Override
    public String agregar(Finan obj) {
        lista.add(obj);
        return "Financiamiento agregado: " + obj.toString();
    }
    
    @Override
    public List<Finan> listar() {
        return lista;
    }
    
    @Override
    public boolean actualizar(int index, Finan nuevoObj) {
        if(index >= 0 && index < lista.size()) {
            lista.set(index, nuevoObj);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean eliminar(int index) {
        if(index >= 0 && index < lista.size()) {
            lista.remove(index);
            return true;
        }
        return false;
    }
    
    @Override
    public Finan buscarPorId(int id) {
        if(id >= 0 && id < lista.size()) {
            return lista.get(id);
        }
        return null;
    }
}

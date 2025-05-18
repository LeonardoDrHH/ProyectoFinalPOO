package backEnd.Denuncias;

import java.util.ArrayList;
import java.util.List;

public class AdminDenuncias {
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
    
    // Actualizar denuncia en un �ndice espec�fico
    public boolean actualizar(int index, Denuncias objActualizado) {
        if (index >= 0 && index < lista.size()) {
            lista.set(index, objActualizado);
            return true;
        }
        return false;
    }
    
    // Eliminar denuncia por �ndice
    public boolean eliminar(int index) {
        if (index >= 0 && index < lista.size()) {
            lista.remove(index);
            return true;
        }
        return false;
    }
}

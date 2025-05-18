/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd.Auditoria;
import backEnd.CRUD.*;
 
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author DANIEL
 */
//bien este clase lo que hace es responder a lo que pida el usuario 
//si pide algo del CRUD se hace el llamado
public class AdminRegistro {
    
private List<Auditoria> lista = new ArrayList<>();

    
    public void agregar(Auditoria obj) {
        lista.add(obj);
    }

    
    public List<Auditoria> listar() {
        return lista;
    }

    
    public Auditoria buscarPorId(int id) {
        for (Auditoria a : lista) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    
    public boolean actualizar(int id, Auditoria objActualizado) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getId() == id) {
                lista.set(i, objActualizado);
                return true;
            }
        }
        return false;
    }

    
    public boolean eliminar(int id) {
        return lista.removeIf(a -> a.getId() == id);
    }

    // Método extra: filtrar por estado
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

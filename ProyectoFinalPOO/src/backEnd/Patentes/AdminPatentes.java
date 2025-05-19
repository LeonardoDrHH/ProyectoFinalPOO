/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//ksjdkajsdk
package backEnd.Patentes;


import backEnd.CRUD.Create;
import backEnd.CRUD.Delete;
import backEnd.CRUD.Read;
import backEnd.CRUD.Update;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DANIEL
 */
public abstract class AdminPatentes implements Create<Patentes>, Read<Patentes>, Update<Patentes>, Delete {
    protected List<Patentes> lista = new ArrayList<>();
    
    
    public String agregar(Patentes obj) {
        lista.add(obj);
        return "Auditoría agregada: " + obj.toString();
    }

    public List<Patentes> listar() {
        return lista;
    }

    public boolean actualizar(int index, Patentes nuevoObj) {
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
}


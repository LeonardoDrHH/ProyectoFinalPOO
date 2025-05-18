/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backEnd;

import backEnd.CRUD.Registro;
import java.util.Date;

/**
 *
 * @author DANIEL
 */
public class Auditoria extends Registro {
    private int idAudi;
    private Date fechaAudi;
    private Estado estado;
    

    public Auditoria(int id, Date fechaCreacion, Estado estado) {
        super(id, fechaCreacion, estado);
    }

    @Override
    public String mostrarInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

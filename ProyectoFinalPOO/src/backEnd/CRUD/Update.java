/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backEnd.CRUD;

/**
 *
 * @author DANIEL
 */
// Actualizar
public interface Update<T> {
    boolean actualizar(int id, T objActualizado);
}
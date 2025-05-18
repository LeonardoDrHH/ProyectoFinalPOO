/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backEnd.CRUD;

import java.util.List;

/**
 *
 * @author DANIEL
 */
// Leer / Listar
public interface Read<T> {
    List<T> listar();
    T buscarPorId(int id);
}
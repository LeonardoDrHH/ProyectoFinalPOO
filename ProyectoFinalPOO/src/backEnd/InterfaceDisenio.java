/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package backEnd;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 *
 * @author lrobl
 */

public interface InterfaceDisenio {
    //Mï¿½todo para autoajustar imagenes dentro de un jButton.
    default void setIcono(String url, JButton boton) {
        ImageIcon icon = new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();

        Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
        boton.setIcon(icono);
    }
    
    
    //Mï¿½todo para autoajustar imagenes dentro de un jLabel.
    default void setIcono(String url, JLabel etiqueta) {
    URL recurso = getClass().getResource(url);
    if (recurso == null) {
        System.err.println("Imagen no encontrada: " + url);
        return;
    }
    ImageIcon icon = new ImageIcon(recurso);
    int ancho = etiqueta.getWidth();
    int alto = etiqueta.getHeight();
    Icon icono = new ImageIcon(icon.getImage().getScaledInstance(ancho, alto, Image.SCALE_SMOOTH));
    etiqueta.setIcon(icono);
}

    
    
    //Mï¿½todo para darle borde redondeado a los objetos que utilicemos.
    default void setBordeRedondeado(JComponent componente, int radio) {
    componente.setBorder(new LineBorder(Color.BLACK, 1, true) {
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(1, 1, 1, 1); // No modifica tamaï¿½o
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }
    });
    }
    
    //Método para alternar colores en la lista
    static void aplicarColoresAlternos(JList<?> list) {
        list.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                          boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (!isSelected) {
                    if (index % 2 == 0) {
                        c.setBackground(new Color(61, 41, 99)); // Color para pares
                    } else {
                        c.setBackground(new Color(26, 15, 43)); // Color para impares
                    }
                }
                return c;
            }
        });
    }
}

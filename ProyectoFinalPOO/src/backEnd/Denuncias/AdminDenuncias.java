package backEnd.Denuncias;

import backEnd.Denuncias.Denuncias;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminDenuncias {
    private List<Denuncias> lista = new ArrayList<>();

    public String agregar(Denuncias d) {
        lista.add(d);
        guardarEnArchivo(d); // Guarda en el archivo
        return "Denuncia agregada y guardada.";
    }

    public List<Denuncias> listar() {
        return lista;
    }

    private void guardarEnArchivo(Denuncias denuncia) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("denuncias.txt", true))) {
            writer.write(denuncia.toString());
            writer.newLine(); // salto de línea
        } catch (IOException e) {
            System.out.println("Error al guardar la denuncia: " + e.getMessage());
        }
    }
}

package backEnd.Financiamiento;

import java.io.*;
import java.util.*;

public class AdminFinan {
    private final List<Finan> lista = new ArrayList<>();
    private final String archivo = "financiamientos.txt";

    public AdminFinan() {
        try (Scanner sc = new Scanner(new File(archivo))) {
            while (sc.hasNextLine()) {
                String[] p = sc.nextLine().split(";");
                lista.add(new Finan(p[0], p[1], Double.parseDouble(p[2])));
            }
        } catch (Exception e) {}
    }

    public String agregar(Finan f) {
        lista.add(f);
        try (PrintWriter w = new PrintWriter(new FileWriter(archivo, true))) {
            w.println(f.getNomEmpresa() + " | " + f.getNomProyec() + " | " + f.getMonto());
        } catch (IOException e) {}
        return "Agregado";
    }

    public List<Finan> listar() {
        return lista;
    }
}

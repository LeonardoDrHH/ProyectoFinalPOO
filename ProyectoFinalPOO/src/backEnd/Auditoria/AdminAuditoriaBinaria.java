package backEnd.Auditoria;

public class AdminAuditoriaBinaria extends AdminAuditoria {

    public AdminAuditoriaBinaria() {
        super();  // Carga la lista desde archivo al iniciar
    }

    @Override
    public Auditoria buscarPorId(int id) {
        // Busca auditoría por id (no índice)
        for (Auditoria a : lista) {
            if (a.getId() == id) {
                return a;
            }
        }
        return null; // No encontrado
    }
}

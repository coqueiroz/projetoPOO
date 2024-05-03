public class Bilhete {
    private int id;
    private int ano;
    private Str mes;
    private int numero;
    private int notaFiscalId;
    private int usuarioId;

    public Bilhete(int id, int ano, Str mes, int numero, int notaFiscalId, int usuarioId) {
        this.id = id;
        this.ano = ano;
        this.mes = mes;
        this.numero = numero;
        this.notaFiscalId = notaFiscalId;
        this.usuarioId = usuarioId;
    }
}
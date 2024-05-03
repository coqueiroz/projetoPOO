public class NotaFiscal {
    private int id;
    private int usuarioId;
    private String chave;
    private int sequencial;
    private String dataProcessamento;

    // Construtor
    public NotaFiscal(int id, int usuarioId, String chave, int sequencial, String dataProcessamento) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.chave = chave;
        this.sequencial = sequencial;
        this.dataProcessamento = dataProcessamento;
    }
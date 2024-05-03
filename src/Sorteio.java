public class Sorteio {
        private int id;
        private int ano;
        private String identificador;
        private String mes;
        private double valorPremio;
        private String apresentador;
        private String auditor;
        private boolean premiado;
        private String descricao;
        private String tipo;

        public Sorteio(int id, int ano, String identificador, String mes, double valorPremio, String apresentador,
                       String auditor, boolean premiado, String descricao, String tipo) {
            this.id = id;
            this.ano = ano;
            this.identificador = identificador;
            this.mes = mes;
            this.valorPremio = valorPremio;
            this.apresentador = apresentador;
            this.auditor = auditor;
            this.premiado = premiado;
            this.descricao = descricao;
            this.tipo = tipo;
        }
}

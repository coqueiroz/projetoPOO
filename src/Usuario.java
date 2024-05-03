public class Usuario {
    private int id;
    private boolean consentimento;
    private String dataNascimento;
    private String nome;
    private String cpf;
    private String email;
    private String perfil;
    private String senha;
    private String telefone;
    private String estado;
    private String municipio;
    private String cep;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;

    public Usuario(int id, boolean consentimento, String dataNascimento, String nome, String cpf, String email,
                   String perfil, String senha, String telefone, String estado, String municipio, String cep,
                   String bairro, String logradouro, String numero, String complemento) {
        this.id = id;
        this.consentimento = consentimento;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.perfil = perfil;
        this.senha = senha;
        this.telefone = telefone;
        this.estado = estado;
        this.municipio = municipio;
        this.cep = cep;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
}

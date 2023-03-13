package classes;

public class PessoaFisica extends Usuario {

    private String nome;
    private int telefone;
    private String email;
    private int cpf;
    private int rg;
    private String endereco;

    public PessoaFisica(int telefone, String email, String endereco, boolean ativo, String senha, int nivelacesso) {
        super(telefone, email, endereco, ativo, senha, nivelacesso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getTelefone() {
        return telefone;
    }

    @Override
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    @Override
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean insertIntoDatabase(){

        return false;
    }


}

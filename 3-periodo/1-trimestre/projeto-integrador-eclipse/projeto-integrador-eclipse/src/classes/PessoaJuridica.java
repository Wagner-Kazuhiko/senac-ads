package classes;

public class PessoaJuridica extends Usuario {

    private String nomeFantasia;
    private int cnpj;
    private int inscricaoEstadual;
    private String razaosocial;

    public PessoaJuridica(int telefone, String email, String endereco, boolean ativo, String senha, int nivelacesso) {
        super(telefone, email, endereco, ativo, senha, nivelacesso);
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public boolean insertIntoDatabase(){

        return false;
    }
}

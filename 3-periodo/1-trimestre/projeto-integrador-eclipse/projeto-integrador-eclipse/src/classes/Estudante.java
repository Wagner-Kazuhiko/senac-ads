package classes;

public class Estudante extends PessoaFisica{

    private int matricula;
    private int registroAcademico;

    private String curso;
    private String polo;
  

    public Estudante(int telefone, String email, String endereco, boolean ativo, String senha, int nivelacesso) {
        super(telefone, email, endereco, ativo, senha, nivelacesso);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getRegistroAcademico() {
        return registroAcademico;
    }

    public void setRegistroAcademico(int registroAcademico) {
        this.registroAcademico = registroAcademico;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getPolo() {
        return polo;
    }

    public void setPolo(String polo) {
        this.polo = polo;
    }


    public void cadastroFornecedor(){

    }

    public void pagamento(double valor){
        valor -= valor;
    }

    public void acessaConteudo(){

    }


    public boolean insertIntoDatabase(){

        return false;
    }
}

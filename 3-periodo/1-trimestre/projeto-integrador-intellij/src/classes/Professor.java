package classes;

public class Professor extends PessoaFisica{

    private int registroProfessor;
    private String materia;

    public Professor(int telefone, String email, String endereco, boolean ativo, String senha, int nivelacesso) {
        super(telefone, email, endereco, ativo, senha, nivelacesso);
    }


    public int getRegistroProfessor() {
        return registroProfessor;
    }

    public void setRegistroProfessor(int registroProfessor) {
        this.registroProfessor = registroProfessor;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void cadastroFornecedor(){

    }

    public void recebimento(double valor){
        valor += valor;
    }

    public boolean insertIntoDatabase(){

        return false;
    }


}

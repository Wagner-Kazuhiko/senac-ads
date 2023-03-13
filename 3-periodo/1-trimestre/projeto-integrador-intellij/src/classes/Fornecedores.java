package classes;

public class Fornecedores extends PessoaJuridica{

    private String servico;
    private String material;

    public Fornecedores(int telefone, String email, String endereco, boolean ativo, String senha, int nivelacesso) {
        super(telefone, email, endereco, ativo, senha, nivelacesso);
    }


    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void recebimento(double valor){
        valor+= valor;
    }

    public void gerenciarDadosPessoais(){

    }

    public void gerenciarDadosEmpresariais(){

    }

    public void gerenciarAulas(){

    }

    public void gerenciarProdutosEServicos(){

    }

    public boolean insertIntoDatabase(){

        return false;
    }
}

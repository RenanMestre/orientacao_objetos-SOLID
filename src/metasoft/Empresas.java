package metasoft;

public class Empresas {
    private String nome;
    private String endereco;
    private String pedido;
    private String observacao;
    
    public void exibirEmpresa(){
        System.out.println("\nSobre a empresa:");
        System.out.println("Empresa: " + getNome() + ";\nEndereço: " + getEndereco() + ";\nPedido: " + getPedido() + ";\nObservações: " + getObservacao() + "\n");
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String Nome){
        this.nome = Nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String Endereco){
        this.endereco = Endereco;
    }

    public String getPedido() {
        return pedido;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}

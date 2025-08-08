package metasoft;

public class Produto {
    private String produto;
    private String descrição;
    private float valor;
    
    public String getProduto(){
        return produto;
    }
    
    public void setProduto(String Produto){
        this.produto = Produto;
    }
    
    public String getDescricao(){
        return descrição;
    }
    
    public void setDescricao(String Descrição){
        this.descrição = Descrição;
    }
    
    public float getValor(){
        return valor;
    }
    
    public void setValor(float valor){
        this.valor = valor;
    }
}

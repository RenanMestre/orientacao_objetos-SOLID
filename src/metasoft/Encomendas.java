package metasoft;

public class Encomendas {
    public Produto[] produtos;
    public float valorTotal;
    public Empresas empresa;
    public Funcionario funcionario;

    public void exibirCompra(){
        System.out.println("Compra realizada:");
        System.out.println("Empresa compradora: " + empresa.getNome() + ", no valor de: " + valorTotal + " com os produtos:");
        for(Produto p : produtos){
            System.out.println(p.getProduto());
        }
    }
    
    public void calculaTotal(){
        valorTotal = 0;
        for(Produto p : produtos){
            valorTotal += p.getValor();
        }
    }
}

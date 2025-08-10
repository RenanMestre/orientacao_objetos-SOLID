package metasoft;

public class MetaSoft {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao sistema MetaSoft!\n");
        // Criando produtos
        Produto p1 = new Produto();
        p1.setProduto("Chapa de aço carbono");
        p1.setDescricao("Chapa metálica de aço carbono 5mm");
        p1.setValor(500.0f);

        Produto p2 = new Produto();
        p2.setProduto("Perfil metálico U");
        p2.setDescricao("Perfil metálico em formato U, aço galvanizado");
        p2.setValor(250.0f);

        Produto p3 = new Produto();
        p3.setProduto("Parafuso de aço inox");
        p3.setDescricao("Parafuso 10mm aço inoxidável");
        p3.setValor(30.0f);
        
        Produto[] produtos = new Produto[] { p1, p2, p3 };

        // Criando empresa
        Empresas empresa = new Empresas();
        empresa.setNome("Metalúrgica Alfa");
        empresa.setEndereco("Av. Industrial, 500");
        empresa.setPedido("Pedido de materiais metálicos para construção");
        empresa.setObservacao("Entrega prioritária");

        // Criando funcionário com construtor
        Funcionario funcionario = new Funcionario("Carlos Alves", "12345678901", "Av. Central, 456");

        // Validando CPF (opcional)
        if (!funcionario.validaCpf()) {
            System.out.println("CPF inválido para o funcionário: " + funcionario.getNome());
            return;
        }

        // Criando encomenda
        Encomendas encomenda = new Encomendas();
        encomenda.produtos = produtos;
        encomenda.empresa = empresa;
        encomenda.funcionario = funcionario;

        // Processando e exibindo
        encomenda.calculaTotal();
        encomenda.exibirCompra();
        empresa.exibirEmpresa();
        funcionario.exibirFuncionario();
    }
}

package metasoft;

public class Funcionario {
    private String nome;
    private String cpf;
    private String endereco;
    
        
    public Funcionario(String nome, String cpf, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public void exibirFuncionario(){
        System.out.println("Sobre o funcionário:");
        System.out.println("Funcionário: " + nome + ";\nCPF: " + cpf + ";\nEndereço: " + endereco);
    }
    
    public boolean validaCpf(){
        return cpf.length() == 11;
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
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}

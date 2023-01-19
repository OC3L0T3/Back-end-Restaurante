package model;

public class Cliente extends Carrinho{
    private String nome, cpf, mesa, pagamento;

    
   public Cliente(){
    
   }
    public Cliente(String nome, String cpf, String mesa, String pagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.mesa =mesa;
        this.pagamento = pagamento;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getmesa(){
        return mesa;
    }
    public void setmesa(String mesa){
        this.mesa = mesa;
    }
    public String getpagamento(){
        return pagamento;
    }
    public void setpagamento(String pagamento){
        this.pagamento = pagamento;
    }
    
   
    public String toString(){
        return "---------------------------------------------" +
        "\n\t***Comanda Gerada***" +
        "\n\n" +
        "Nome: " + getNome() +
        "\nCPF: " + getCpf() +
        "\nMesa: " + getmesa() +
        "\nForma de pagamento: " + getpagamento();
        
    }
   
    
}

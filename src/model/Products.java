package model;


public class Products {

    protected String Nome;
	protected int Id;
    protected double Preco;
    protected String Descricao;

    public Products(int id, String nome, double preco) {
        super();
        this.Nome = nome;
        this.Id = id;
        this.Preco = preco;
    }

    public Products() {
	}


	public int getId() {
        return Id;
    }
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        this.Descricao = descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        this.Preco = preco;
    }

    public Products atualizar(String nome, double preco, int id) { //A função recebe o nome, preço e id a serem atualizados
        Products produto = new Products(id, nome, preco); //cria uma variável para armazenar os dados passados do produto e retornar
        return produto; //retorna o produto com os dados atualizados
    }
    
    //essa função acabei não utilizando, talvez vc use pra alguma coisa, então mantive
    public void exibeAdicao(Products produto) { //Recebe um produto qualquer que queira exibir na tela
    	 System.out.println("Produto: " +produto.Nome); //Acessa o atríbuto "Nome" do produto que foi passado pelo App.java
         System.out.println("ID: " +produto.Id); //Acessa o atríbuto "Id" do produto que foi passado pelo App.java
         System.out.printf("preço R$:%.2f ", produto.Preco); //Acessa o atríbuto "Preco" do produto que foi passado pelo App.java
         System.out.println();
    }
    
    //Parecida com a função de cima, só que vamos exibir os dados de um produto para o menu
    public void exibirDados() {
    	System.out.printf("\nProduto: %s \nID: %d  \nPreço: R$:%.2f \n", this.Nome, this.Id, this.Preco); //Usei o this para exibir os dados do produto que chamou la no App.java
    }
    

	public int getId(Products produto) { //retorna o Id de um produto qualquer
		return produto.Id;
	}

    
   
  

}

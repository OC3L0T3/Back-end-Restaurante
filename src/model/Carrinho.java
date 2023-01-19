package model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho extends Products{
	private ArrayList<Products> listaDeProdutos = new ArrayList<Products>();
	
	public Carrinho() {
		
	}
	
	public Products getProduto(int id) { //recebe o id de um produto e retorna ele com base na lista, exemplo: se eu pesquisar o id 1, por padrão vai retornar a parmegiana (lembrando que retorna o produto inteiro)
		return listaDeProdutos.get(id); //essa função .get não foi criada por mim, ela é uma função que existe para o tipo ArrayList, então todos os Arraylists vão ter essa função disponível, e ela simplesmente pega o item da lista de acordo com a posição dele (NÃO É PELO ID QUE A VC CRIOU E SIM PELA ORDEM QUE FOI ADICIONADO !)   
	}
	
	public void setProduto(Products novoProduto) {
		listaDeProdutos.add(novoProduto); //mesma coisa da função get, a função add é padrão de ArrayList, e ela adiciona mais um elemento por último na lista, então se já tem 2 itens na lista, esse item seria o 3 adicionado e de índice 2 (começando do 0)
	}
	
	public List<Products> getTodosOsProdutos() { // Retorna a lista completa
		return listaDeProdutos; 
	}
	
	public void exibeTodosOsProdutos() { //Exibe todos os itens da lista na tela, não retorna nada, é só pra exibir mesmo
		for(int i = 0; i < this.listaDeProdutos.size(); i++) { // usei o for aqui por ser mais simples de entender, a função "size" também é uma função própria do ArrayList, e ela retorna um inteiro igual ao tamanho total da lista, no nosso exemplo o tamanho total seria 2, então a cada interação do for, ele compara o i com 2.


			System.out.printf("\nId: %d\t Nome: %s\t Preço: R$:%.2f\n", listaDeProdutos.get(i).getId(), listaDeProdutos.get(i).getNome(), listaDeProdutos.get(i).getPreco()); //Exibe os itens da lista, expliquei melhor no txt,
		}
	}
	
	public double Total() { // Função pra calcular o valor total da conta, mesmo princípio da função anterior, a diferença é que fiz contas só usando o preço de cada produto na lista 
		double total = 0; //total = 0, assim sempre se retorna algum valor, mesmo que se não tenha nada na lista, evitando erros
		for(int i = 0; i < this.listaDeProdutos.size(); i++) { // peguei o tamanho da lista no for novamente, mesma coisa
			total = total + this.listaDeProdutos.get(i).Preco; // aqui eu usei o total = total + o preço do item em cada interação
		}
		return total; // retorna o total depois de calcular cada item
	}


		
	
}

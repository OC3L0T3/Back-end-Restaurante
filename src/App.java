import java.util.Scanner;

import model.Cliente;
import model.Products;
import model.Carrinho;

public class App {

    private static Scanner leia = new Scanner(System.in);
    private static Cliente pessoa = new Cliente();
    static Products parmegiana1 = new Products(1, "Parmegiana", 65);
    static Products guarana = new Products(2, "Guaraná", 5);
    static Products feijoada = new Products(3, "Feijoada", 50.0);
    static Carrinho carrinho = new Carrinho();

    public static void main(String[] args) {

        System.out.println("-------------------------------------------------");
        System.out.println("\tBem vindo ao nosso restaurante!");
        System.out.println("-------------------------------------------------");
        System.out.println("Por favor, entre com seu nome: ");
        pessoa.setNome(leia.nextLine());

        System.out.println("Digite seu CPF: ");
        pessoa.setCpf(leia.nextLine());
        System.out.println("Digite o numero da mesa: ");
        pessoa.setmesa(leia.nextLine());
        System.out.println("-------------------------------------------------");
        menu();
    }

    private static void menu() {

        System.out.println("-------Selecione uma opção que deseja realizar-------");
        System.out.println("-----------------------------------------------------");
        System.out.println("|    Opção 1 - Ver cardápio      |"); 
        System.out.println("|    Opção 2 - Selecionar itens  |"); 
        System.out.println("|    Opção 3 - Comprar           |"); 
        System.out.println("|    Opção 4 - Sair              |");
        System.out.println("-----------------------------------------------------");

        int opcao = leia.nextInt();
        int pagamento;

        switch (opcao) {
            case 1:
                exibirCardápio();
                menu();
                break;

            case 2:
                selecionarItem();
                menu();
                break;
            case 3:

                if (carrinho.Total() > 0) {
                    System.out.println("---------------------------------------------");
                    System.out.printf("Total do Pedido: R$:%.2f \n", carrinho.Total());
                    System.out.println("---------------------------------------------");
                    System.out.println("Por favor, informe a forma de pagamento: \n" +
                            "1 - Débito\n" +
                            "2 - Crédito\n" +
                            "3 - Dinheiro/Pix");
                    pagamento = leia.nextInt();

                    if (pagamento == 1) {
                        pessoa.setpagamento("Débito");
                    } else if (pagamento == 2) {
                        pessoa.setpagamento("Crédito");
                    } else if (pagamento == 3) {
                        pessoa.setpagamento("Dinheiro/Pix");
                    } else {
                        System.out.println("Seleção inválida");
                        menu();
                    }
                    comprarItem();

                } else {
                    System.out.println("\tComanda sem valor, voltando ao menu");
                    System.out.println("---------------------------------------------");
                    menu();
                }
                break;

        }
    }

    private static void exibirCardápio() {
        parmegiana1.exibirDados();
        guarana.exibirDados();
        feijoada.exibirDados();
    }

    public static void selecionarItem() {

        char controle = 's';
        do {
            System.out.println("Digite o ID que deseja adicionar ao carrinho: ");
            int id = leia.nextInt();
            adicionaNoCarrinho(id);
            System.out.println("Deseja adicionar outro item (S/N)?");
            controle = leia.next().charAt(0);
        } while (controle == 's' || controle == 'S');

    }

    public static void adicionaNoCarrinho(int id) { // recebe o id do produto e dependendo do numero que foi informado
                                                    // ele adiciona um produto ao carrinho
        switch (id) {
            case 1:
                carrinho.setProduto(parmegiana1);
                System.out.println("\nProduto adicionado***\n");
                break;
            case 2:
                carrinho.setProduto(guarana);
                System.out.println("\nProduto adicionado***\n");
                break;

            case 3:
                carrinho.setProduto(feijoada);
                System.out.println("\nProduto adicionado***\n");
                break;

            default:
                System.out.println("\nInsira um ID válido!\n");
                break;
        }
    }

    public static void comprarItem() {
        System.out.println(pessoa);
        carrinho.exibeTodosOsProdutos();
        System.out.printf("\nTotal: R$:%.2f \n", carrinho.Total());
        System.out.println();
        System.out.println("Pedido registrado com sucesso! Aguarde um de nossos atendendes");
        System.out.println();
        System.out.println("Obrigado e volte sempre :) \n");
        System.out.println("---------------------------------------------");
    }



}


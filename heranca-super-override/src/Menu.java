import Produtos.*;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CRIAÇÃO DOS PRODUTOS DA LOJA
        Celular cel = new Celular();
        Radio fm = new Radio();
        Tablet tab = new Tablet();
        Televisao tv = new Televisao();
        Videogame game = new Videogame();

        // MENSAGEM DE BOAS VINDAS
        System.out.println("\nSeja bem vindo(a) a loja do Emerson!");

        // CRIAÇÃO DO CARRINHO
        int itensComprados = 0;
        Produto[] carrinho = new Produto[999];
        boolean comprando = true;

        // MENU DE ESCOLHAS DOS PRODUTOS
        while (comprando == true) {
            System.out.println("====================================" + "\n          PRODUTOS DA LOJA" + "\n====================================");
            System.out.println("1. " + cel + "\n2. " + fm + "\n3. " + tab + "\n4. " + tv + "\n5. " + game + "\n6. Encerrar compras e ir ao resumo do carrinho");
            System.out.print("\nDigite o numero do produto a ser adicionado no carrinho ou encerrar compras: ");

            int escolhaDoProduto = scanner.nextInt();

            switch (escolhaDoProduto) {

                // ESCOLHA CELULAR
                case 1: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Celular();
                        itensComprados++;
                        System.out.println("Celular adicionado ao carrinho");
                        break;
                    }
                    // ESCOLHA RÁDIO
                case 2: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Radio();
                        itensComprados++;
                        System.out.println("Radio adicionado ao carrinho");
                        break;
                    }
                    // ESCOLHA TABLET
                case 3: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Tablet();
                        itensComprados++;
                        System.out.println("Tablet adicionado ao carrinho");
                        break;
                    }
                    // ESCOLHA TELEVISÃO
                case 4: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Televisao();
                        itensComprados++;
                        System.out.println("Televisão adicionado ao carrinho");
                        break;
                    }
                    // ESCOLHA VIDEO GAME
                case 5: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Videogame();
                        itensComprados++;
                        System.out.println("Video game adicionado ao carrinho");
                        break;
                    }
                    // SAINDO DAS COMPRAS
                case 6: comprando = false; break;

                // TRATAMENTO ENTRADAS INVÁLIDAS
                default: System.out.println("Opção invalida. Digite novamente!");
            }

            // QUANDO CARRINHO CHEIO
            if (itensComprados >= carrinho.length) {
                System.out.println("\nLimite máximo do carrinho atingido!");
                comprando = false;
                System.out.println("Indo para o resumo do carrinho");
            }
        }

        // METODO DE EXIBIÇÃO DO CARRINHO
        ExibirCarrinho(carrinho, itensComprados);

        scanner.close();
    }

    public static void ExibirCarrinho(Produto[] carrinho, int itensComprados) {

        if (itensComprados == 0) {
            System.out.println("Nenhum produto foi comprado");
            return;
        }

        // ORDENAÇÃO DO VETOR PRODUTO USANDO BOOLEAN
        double valorTotal = 0;
        boolean[] contado = new boolean[itensComprados];
        for (int i = 0; i < itensComprados; i++) {
            if (contado[i]) {
                continue;
            }
            int quantidade = 1;
            for (int j = i + 1; j < itensComprados; j++) {

                if (carrinho[i].getNome().equals(carrinho[j].getNome())) {
                    quantidade = quantidade + 1;
                    contado[j] = true;
                }
            }
            // EXIBIR PRODUTO ORGANIZADO
            System.out.println("Qntd.: " + quantidade + " | " + carrinho[i].getNome() + " | Subtotal: R$ " + (quantidade * carrinho[i].getPreco()));
            valorTotal = (quantidade * carrinho[i].getPreco()) + valorTotal;
        }
        System.out.println("Valor total das compras: R$ " + valorTotal);
    }
}

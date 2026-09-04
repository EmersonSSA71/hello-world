import Produtos.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celular cel = new Celular();
        Radio fm = new Radio();
        Tablet tab = new Tablet();
        Televisao tv = new Televisao();
        Videogame game = new Videogame();


        System.out.println("\nSeja bem vindo(a) a loja do Emerson!");

        int itensComprados = 0;
        Produto[] carrinho = new Produto[99999999];
        boolean comprando = true;

        while (comprando == true) {
            System.out.println("====================================" + "\n          PRODUTOS DA LOJA" + "\n====================================");
            System.out.println("1. " + cel + "\n2. " + fm + "\n3. " + tab + "\n4. " + tv + "\n5. " + game + "\n6. Encerrar compras e ir ao resumo do carrinho");
            System.out.print("\nDigite o numero do produto a ser adicionado no carrinho ou encerrar compras: ");
            int escolhaDoProduto = scanner.nextInt();

            switch (escolhaDoProduto) {
                case 1: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Celular();
                        itensComprados++;
                        System.out.println("Celular adicionado ao carrinho");
                        break;
                    }

                case 2: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Radio();
                        itensComprados++;
                        System.out.println("Radio adicionado ao carrinho");
                        break;
                    }

                case 3: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Tablet();
                        itensComprados++;
                        System.out.println("Tablet adicionado ao carrinho");
                        break;
                    }
                case 4: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Televisao();
                        itensComprados++;
                        System.out.println("Televisão adicionado ao carrinho");
                        break;
                    }
                case 5: if (carrinho[itensComprados] == null) {
                        carrinho[itensComprados] = new Videogame();
                        itensComprados++;
                        System.out.println("Video game adicionado ao carrinho");
                        break;
                    }
                case 6: comprando = false; break;

                default: System.out.println("Opção invalida. Digite novamente!");
            }

            if (itensComprados >= carrinho.length) {
                System.out.println("\nLimite máximo do carrinho atingido!");
                comprando = false;
            }
        }
        ExibirCarrinho(carrinho, itensComprados);
        scanner.close();
    }

    public static void ExibirCarrinho(Produto[] carrinho, int itensComprados) {

        if (itensComprados == 0) {
            System.out.println("Nenhum produto foi comprado");
            return;
        }

        Map<String, Integer> organizar = new HashMap<>();
        Map<String, Integer> organizarPreco = new HashMap<>();

        for (int i = 0; i < itensComprados; i++) {
            String nome1 = carrinho[i].getNome();

            organizar.put(nome1, organizar.getOrDefault(nome1, 0) + 1);
            organizarPreco.put(nome1, (int)carrinho[i].getPreco());

        }


        for (int i = 0; i < itensComprados; i++) {
            if (carrinho[i] != null) {
                System.out.println(carrinho[i]);
            }
        }
    }
}

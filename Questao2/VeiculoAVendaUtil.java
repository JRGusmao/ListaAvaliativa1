package ListaAvaliativa1.Questao2;

import java.util.Scanner;

public class VeiculoAVendaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipo, placa;
        int ano;
        double preco;
        final int TAMANHO = 5;

        VeiculoAVenda[] veiculos = new VeiculoAVenda[TAMANHO];
        int contador = 0;

        do {

            System.out.println("\nTipo (Automovel, motocicleta): ");
            tipo = sc.nextLine();

            System.out.println("\nAno de lancamento: ");
            ano = sc.nextInt();

            sc.nextLine();
            System.out.println("\nPlaca do veiculo: ");
            placa = sc.nextLine();

            System.out.println("\nPreco de venda: ");
            preco = sc.nextDouble();
            sc.nextLine();
            System.out.println();

            if (tipo.equalsIgnoreCase("Automovel")) {
                AutomovelAVenda veiculo = new AutomovelAVenda(ano, placa, preco);
                veiculos[contador] = veiculo;
            } else if (tipo.equalsIgnoreCase("Motocicleta")) {
                MotocicletaAVenda veiculo = new MotocicletaAVenda(ano, placa, preco);
                veiculos[contador] = veiculo;
            }
            contador++;
        } while (contador < TAMANHO);

        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("*********Descrição dos veículos**********" + "\n" + veiculos[i].getDescricao() + "\n");

        }

        sc.close();
    }

}

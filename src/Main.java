import ImpostoRenda.GerenciadorDeImpostoDeRenda;
import ImpostoRenda.RendaVariavel;
import ImpostoRenda.Salario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Salário");
            System.out.println("2. Adicionar Renda Variável");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            processarOpcao(opcao, scanner, gerenciador);

        } while (opcao != 0);

        scanner.close();
    }

    private static void processarOpcao(int opcao, Scanner scanner, GerenciadorDeImpostoDeRenda gerenciador) {
        switch(opcao){
            case 1:
                System.out.println("Informe o valor do salário: ");
                double salario = scanner.nextDouble();
                gerenciador.adicionar(new Salario(salario));
                break;
            case 2:
                System.out.println("Informe os lucros de renda variáveis: ");
                double lucros = scanner.nextDouble();
                gerenciador.adicionar(new RendaVariavel(lucros));
                break;
            case 0:
                System.out.println("Fechando o programa");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Total acumulado de impostos: " + gerenciador.calcularTotalImpostos());
    }
}
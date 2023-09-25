/*
 * Autor - Matheus Fagundes Araujo
 * Ultima Atualizacao - 28/08/2023
 * Objetivo - Lista com metodo de incerir, remover, mostrar
 */


import java.util.Scanner;

public class Fila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FFila fila = new FFila();

        int escolha;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Inserir elemento");
            System.out.println("2 - Remover elemento");
            System.out.println("3 - Mostrar fila");
            System.out.println("0 - Sair");

            escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.println("Digite o elemento a ser inserido:");
                    String elemento = scanner.nextLine();
                    fila.inserir(elemento);
                    break;
                case 2:
                    System.out.println("Digite o elemento a ser removido:");
                    int numElemento =  scanner.nextInt();
                    scanner.nextLine();
                    numElemento--;
                    fila.remover(numElemento);
                    break;
                case 3:
                    fila.mostrar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}

class FFila {
    private int quant = 100;
    private int controlador = 0;
    private String[] elementosDaFila = new String[quant];

    FFila() {}

    public void inserir(String elemento) {
        if (controlador < quant) {
            elementosDaFila[controlador] = elemento;
            controlador++;
        } else {
            System.out.println("Fila cheia. Não é possível inserir mais elementos.");
        }
    }

    public void mostrar() {
        System.out.println("Elementos na fila:");
        for (int i = 0; i < controlador; i++) {
            System.out.println((i + 1) + " " + elementosDaFila[i]);
        }
    }

    public void remover(int numElemento) {
        if (controlador > 0) {
            for (int i = numElemento; i < controlador - 1; i++) {
                elementosDaFila[i] = elementosDaFila[i + 1];
            }
            controlador--;
            System.out.println("Elemento removido.");
        } else {
            System.out.println("Fila vazia. Não é possível remover elementos.");
        }
    }
}

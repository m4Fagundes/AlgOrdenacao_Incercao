/*
 * Autor - Matheus Fagundes Araujo
 * Ultima Atualizacao 25/09/2023
 * Objettivo - Implementar o algoritmo de ordenacao por incersao
 */

public class OrdenacaoSelecao {
    public static void main(String[] rags) {
        int[] vetor = { 1, 23, 45, 2, 3, 44, 57, 9, 87, 12 };
        Selecao(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }

    public static void Selecao(int[] vetor) {
        int contador = 0;
        int temp = 0, temp2 = 0;
        while (contador < vetor.length - 1) {
            int menor = vetor[contador];
            for (int i = contador + 1; i < vetor.length; i++) {
                if (vetor[i] < menor) {
                    menor = vetor[i];
                    temp2 = i;
                }
            }
            temp = vetor[contador];
            vetor[contador] = vetor[temp2];
            vetor[temp2] = temp;
            contador++;
        }
    }
}

/*
 * Autor - Matheus Fagundes
 * Ultima Atualizacao - 25/09/2023
 * Objetivo - Implementar a pesquisa binaria nao recursiva
 */

 import java.util.Scanner;;

public class PesqBinaria {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
        int aPesquisar = scanner.nextInt();
        scanner.nextLine();

        if(PesquisaBinaria(vetor, aPesquisar)){
            System.out.println("O numero esta presente no array");
        } else System.out.println("O numero nao esta presente no aray");
    }

    public static boolean PesquisaBinaria(int[] vetor, int numero){
        boolean resp = false;
        int dir = vetor.length -1, esq = 0;
        int meio =0;
        while(esq <= dir){
            meio = (esq+dir)/2;
            if(numero == vetor[meio]){
                resp = true; 
                esq = vetor.length;
            } else if (numero> vetor[meio]){
                esq = meio +1;
            } else {
                dir = meio -1;
            }
        }
        return resp;
    }
}

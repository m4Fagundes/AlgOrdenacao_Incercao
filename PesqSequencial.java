/*
 * Autor - Matheus Fagundes
 * Ultima Atualizacao - 25/08/2023
 * Objetivo - Implementar a pesquisa sequencial
 */

import java.util.Scanner;

public class PesqSequencial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = {1, 23, 45, 2, 3, 44, 57, 9, 87, 12};  

        System.out.println("Digite o valor que deseja pesquisar no array");

        int valor = scanner.nextInt();
        scanner.nextLine();

        if(PesquisaSequencial(vetor,valor)){
            System.out.println("O valor esta presente no array");
        } else System.out.println("O valor nao esta presente no array");
    }

    public static boolean PesquisaSequencial(int[] vetor, int numero){
        
        boolean resp = false;
        for(int i=0; i<vetor.length; i++){
            if(vetor[i] == numero){
                resp = true;
                i = vetor.length;
            }
        }
        return resp;
    }
    
} 

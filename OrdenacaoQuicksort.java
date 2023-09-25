/*
 * Autor - Matheus Fagundes
 * Ultima Atualizacao - 25/08/2023
 * Objetivo - Implementar ordenacao quicksort
 */


 public class OrdenacaoQuicksort {
    public static void main(String[] args){
 
        int[] vetor = {1, 23, 45, 2, 3, 44, 57, 9, 87, 12};
        Quicksort(vetor, 0,vetor.length-1);

        for(int i=0; i<vetor.length; i++){
            System.out.print(" " + vetor[i]);
        }
    }

    public static void Quicksort(int[] vetor, int esq, int dir){
        int i = esq, j = dir, pivo = vetor[(esq+dir)/2];
        int temp=0;
        while(i<=j){
            while(vetor[i] < pivo){
                i++;
            }
            while(vetor[j] > pivo){
                j--;
            }
            if(i<=j){
                temp = vetor[i];
                vetor[i]=vetor[j];
                vetor[j]=temp;
                i++;
                j--;
            }
        }
        if(esq<j){
            Quicksort(vetor,esq,j);
        }
        if(i<dir){
            Quicksort(vetor,i,dir);
        }
    }
 
     
 } 
 
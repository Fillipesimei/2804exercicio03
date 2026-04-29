//Fillipe Símei Souza Ribeiro
//1261940446


public class Main {

    public static int encontrarMaior(int[] numeros) {
        int maior = numeros[0]; 

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; 
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] array1 = {29, 35, 2, 97, 78};
        int[] array2 = {475, 102, 777};

        System.out.println("Maior valor: " + encontrarMaior(array1)); 
        System.out.println("Maior valor: " + encontrarMaior(array2)); 
    }
}

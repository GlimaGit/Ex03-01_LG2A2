public class ex {

    public static void main(String[] args) {

//        double valor1 = 10.2;
//        double valor2 = 5.1;
//        double valor3 = 12.3;
//        double valor4 = 6.4;
//        double valor5 = 8.0;
//        double valor6 = 4.2;

        double[] valores = new double[6];
        // PREENCHER ARRAY
        valores[0] = 10.2;
        valores[1] = 5.1;
        valores[2] = 12.3;
        valores[3] = 6.4;
        valores[4] = 8.0;
        valores[5] = 4.2;

        System.out.print("> java Main");

        for (double valor : valores) {
            System.out.print(" " + valor);
        }

        System.out.print("\n\nConjunto: ");

        for (double valor : valores) {
            System.out.print(valor + ", ");
        }

        double media = 0;
        for(int i = 0; i<valores.length; i++)
            media += valores[i];

        double total = media / valores.length;

        System.out.println("\nMédia: "+total);

//        int maior = Integer.MIN_VALUE;
//        int indiceMaior = -1;
//        for (int i = 0; i < valores.length; i++) {
//            if (valores[i] > maior) {
//                maior += valores[i];
//                indiceMaior = i;
//            }
//        }
//        System.out.printf("Maior número é %d", maior);

        double max = 0.0;//aqui a variável max recebe o valor do primeiro item do array
        for (int i = 1; i < valores.length; i++) {//aqui a iteração irá ocorrer
            if (valores[i] > max){ //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.
                max = valores[i];
            }
        }
        System.out.println("Maior valor: " + max);

        double min = 0.0;// variável max recebe o valor do primeiro item do array
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > min){ //caso o valor da posição i seja maior que o valor de max, max será substituído pelo valor da i-ésima posição.
                min = valores[i];
            }
        }

        System.out.println("Menor valor: " +  valores[valores.length-1]);
    }
}

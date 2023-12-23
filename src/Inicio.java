public class Inicio {

    public static void main(String[] args) throws Exception {
        Arquivo file = new Arquivo("src/instancia.txt");
        file.ReadFile();

        double[][] matrizCustoTransporte = file.matrizCustoTransporte;
        double[] vetorOfertaOrigem = file.vetorOfertaOrigem;
        double[] vetorDemandasDestino = file.vetorDemandasDestino;

        double[][] matrizResultado = new double[file.numeroOrigensM][file.numeroDestinosN];

        resolveCantoNoroeste(matrizResultado, vetorDemandasDestino);
    }

    public static void resolveCantoNoroeste(double[][] matrizResultado, double[] vetorDemandasDestino) {
        solucaoInicial(matrizResultado, vetorDemandasDestino, vetorDemandasDestino);
    }

    public static void solucaoInicial(double[][] matrizResultado, double[] vetorDemandasDestino,
            double[] vetorOfertaOrigem) {
        int index = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < vetorOfertaOrigem.length; i++) {
            if (matrizResultado[linha][coluna] == vetorOfertaOrigem[i]) { // *Oferta igual a demanda
                matrizResultado[linha][coluna] = vetorOfertaOrigem[i];
                vetorOfertaOrigem[i] = 0;
                vetorDemandasDestino[i] = 0;
            } else if (matrizResultado[linha][coluna] < vetorOfertaOrigem[i]) { // *Oferta maior que a demanda
                ++coluna;

                while (matrizResultado[linha][coluna]) {
                }

            } else if (matrizResultado[linha][coluna] > vetorOfertaOrigem[i]) { // *Oferta menor que a demanda
            }
        }
    }
}

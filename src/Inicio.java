import java.util.Arrays;

public class Inicio {

    public static void main(String[] args) throws Exception {
        Arquivo file = new Arquivo("src/instancia.txt");
        file.ReadFile();

        int[][] matrizCustoTransporte = file.matrizCustoTransporte;
        int[] vetorOfertaOrigem = file.vetorOfertaOrigem;
        int[] vetorDemandasDestino = file.vetorDemandasDestino;
        int custoFinal = 0;

        int[][] matrizResultado = new int[file.numeroOrigensM][file.numeroDestinosN];

        matrizResultado = resolveCantoNoroeste(file, matrizResultado, vetorDemandasDestino, vetorOfertaOrigem);
        for (int i = 0; i < file.numeroOrigensM; i++) {
            for (int j = 0; j < file.numeroDestinosN; j++) {
                matrizResultado[i][j] = matrizResultado[i][j] * matrizCustoTransporte[i][j];
                custoFinal += matrizResultado[i][j];
            }
        }
        System.err.println(Arrays.deepToString(matrizResultado));
        System.out.println("O custo final da instância fornecida é de: " + custoFinal);
    }

    public static int[][] resolveCantoNoroeste(Arquivo file, int[][] matrizResultado,
            int[] vetorDemandasDestino,
            int[] vetorOfertaOrigem) {

        int i = 0;
        int j = 0;

        while (i < file.numeroOrigensM && j < file.numeroDestinosN) {
            int aux = Math.min(vetorDemandasDestino[j], vetorOfertaOrigem[i]);

            matrizResultado[i][j] = aux;
            vetorOfertaOrigem[i] -= aux;
            vetorDemandasDestino[j] -= aux;

            if (vetorOfertaOrigem[i] == 0) {
                i++;
            }
            if (vetorDemandasDestino[j] == 0) {
                j++;
            }
        }

        return matrizResultado;
    }
}

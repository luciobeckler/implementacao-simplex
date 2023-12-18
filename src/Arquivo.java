import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Arquivo {
  private String filePath;
  private int numeroOrigensM;
  private int numeroDestinosN;
  private int[] vetorAtendimentoOrigem;
  private int[] vetorDemandasDestino;
  private double[][] matrizCustoTransporte;

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public Arquivo(String filepath) {
    this.setFilePath(filepath);
  }

  public void ReadFile() throws Exception {

    File arquivo = new File(this.filePath);
    Scanner scan = new Scanner(arquivo);

    numeroOrigensM = Integer.valueOf(scan.nextLine());
    numeroDestinosN = Integer.valueOf(scan.nextLine());
    getCapacitadeAtendimento(scan);
    getDemandasDestino(scan);
    getCustosTransportes(scan);
  }

  // Função que salva no arrayObjetivo a função objetivo em forma de numeros
  public void getCapacitadeAtendimento(Scanner scanner) {
    String linha = scanner.nextLine();
    String[] numerosOrigem = linha.split(" ");

    vetorAtendimentoOrigem = new int[numerosOrigem.length];

    for (int i = 0; i < vetorAtendimentoOrigem.length; i++) {
      vetorAtendimentoOrigem[i] = Integer.parseInt(numerosOrigem[i]);
      System.err.println(vetorAtendimentoOrigem[i]);

    }
  }

  public void getDemandasDestino(Scanner scanner) {
    String linha = scanner.nextLine();
    String[] numeroDestino = linha.split(" ");

    vetorDemandasDestino = new int[numeroDestino.length];

    for (int i = 0; i < vetorDemandasDestino.length; i++) {
      vetorDemandasDestino[i] = Integer.parseInt(numeroDestino[i]);
      System.err.println(vetorDemandasDestino[i]);
    }
  }

  public void getCustosTransportes(Scanner scanner) {
    matrizCustoTransporte = new double[numeroOrigensM][numeroDestinosN];

    for (int i = 0; i < numeroOrigensM; i++) {
      String linha = scanner.nextLine();
      String[] numerosRestricoes = linha.split(" ");

      for (int j = 0; j < numeroDestinosN; j++) {
        matrizCustoTransporte[i][j] = Integer.parseInt(numerosRestricoes[j]);
      }
    }
    System.err.println(Arrays.deepToString(matrizCustoTransporte));
  }

}

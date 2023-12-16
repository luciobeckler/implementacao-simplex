import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
  private String filePath;
  private boolean tipoProblema;
  private int numeroVariaveis;
  private int coeficientesVaiaveis;

  public File(String filepath) {
    this.setFilePath(filepath);
  }

  public void ReadFile() throws Exception {
    try {
      FileReader fileReader = new FileReader(this.getFilePath());

      BufferedReader bufferReader = new BufferedReader(fileReader);

      String line;

      while ((line = bufferReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {

    }
  }

  public boolean isTipoProblema() {
    return tipoProblema;
  }

  public void setTipoProblema(boolean tipoProblema) {
    this.tipoProblema = tipoProblema;
  }

  public int getNumeroVariaveis() {
    return numeroVariaveis;
  }

  public void setNumeroVariaveis(int numeroVariaveis) {
    this.numeroVariaveis = numeroVariaveis;
  }

  public int getCoeficientesVaiaveis() {
    return coeficientesVaiaveis;
  }

  public void setCoeficientesVaiaveis(int coeficientesVaiaveis) {
    this.coeficientesVaiaveis = coeficientesVaiaveis;
  }

  public String getFilePath() {
    return filePath;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
}

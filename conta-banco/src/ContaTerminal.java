import java.util.Scanner;

public class ContaTerminal {
  private int numero;
  private String agencia;
  private String nomeCliente;
  private double saldo;
  private String mensagemFinal = "";

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void setAgencia(String agencia) {
    this.agencia = agencia;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public String solicitarInformacoes(String mensagem) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(mensagem);
    return scanner.nextLine();
  }

  public void mensagemCliente() {
    // "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
    this.mensagemFinal = this.mensagemFinal.concat("Olá "+this.nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+this.agencia+", conta "+this.numero+" e seu saldo "+this.saldo+" já está disponível para saque.");
    System.out.println("");
    System.out.println(this.mensagemFinal);
  }
}

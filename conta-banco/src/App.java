public class App {
    public static void main(String[] args) throws Exception {
        ContaTerminal conta = new ContaTerminal();

        conta.setAgencia(conta.solicitarInformacoes("Por favor, digite o número da Agência: "));
        conta.setNumero(Integer.parseInt(conta.solicitarInformacoes("Por favor, digite o número da Conta: ")));
        conta.setNomeCliente(conta.solicitarInformacoes("Por favor, digite o nome do Cliente: "));
        conta.setSaldo(Double.parseDouble(conta.solicitarInformacoes("Por favor, digite o valor do Saldo: ")));

        conta.mensagemCliente();
    }
}

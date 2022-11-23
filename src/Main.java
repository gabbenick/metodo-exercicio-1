import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Double num1 = scan.nextDouble();
        Double num2 = scan.nextDouble();

        Calculadora.soma(num1, num2);
        Calculadora.subtrai(num1, num2);
        Calculadora.multiplica(num1, num2);
        Calculadora.divide(num1, num2);

        Mensagem.obterMensagem(8);

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
    }
}

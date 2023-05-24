package calcular;

import java.util.Scanner;

public class CalculoDePorcentagem {
    public static void main(String[] args) {
        //linha para importar o Scanner
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um valor:\n");
        //variável que vai receber o valor para calcular a porcentagem
        double valorTotal = leitura.nextDouble();
    System.out.println("Digite o valor da porcentagem:\n");
        //variável que vai receber o valor da porcentagem
        double percentual = leitura.nextDouble();
//variável que vai ter o resultado recebendo o calculo do metodo
        double resultado = calcularPorcentagem(valorTotal, percentual);
        //mensagem que vai aparecer com o resultado
        System.out.println("O resultado é: " + resultado);
    }
//método para fazer o calculo
    public static double calcularPorcentagem(double valorTotal, double percentual) {
        return (valorTotal * percentual) / 100;

    }
}


import java.util.Scanner;

public class Contador extends Exception {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
                // chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);

            } catch (Exception e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro ");
                // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            }
        }

    }

    static void contar(int parametroUm, int parametroDois) throws Contador {
        if (parametroUm > parametroDois)
            throw new Contador();
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        int contagem = parametroDois - parametroUm;

        for (int i = contagem; i <= contagem; ++i) {
            System.out.println("Aqui está os resultados: " + i);
        }
        // realizar o for para imprimir os números com base na variável contagem
    }
}

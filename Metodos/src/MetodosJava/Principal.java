package MetodosJava;

public class Principal {
    public static void main(String[] args) {

        // Calculadora
        // System.out.println("Exercicios calculadora:");
        // Calculadora.soma(4, 7);
        // Calculadora.subitracao(25, 12);
        // Calculadora.multiplicacao(8, 8);
        // Calculadora.divisao(81, 9);

        // Mensagem
        // System.out.println("Exercicio Mensagem:");
        // Mensagem.mensagen(0);

        // Emprestimo
        System.out.println("Exercicio Emprestimo:");
        Emprestimo.calcula(1000, 2);
        Emprestimo.calcula(1000, Emprestimo.tresParcelas());
        Emprestimo.calcula(1000, 4);
    }
}

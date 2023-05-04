package MetodosJava;

public class Emprestimo {

    private static int duasParcelas() {
        return 2;
    }

    public static int tresParcelas() {
        return 3;
    }

    public static double taxaDuasParcelas() {
        return 0.3;
    }

    public static double taxaTresParcelas() {
        return 0.45;
    }

    public static void calcula(double valor, int parcela) {

        if (parcela == 2) {
            double valorParcela;
            valorParcela = valor + (valor * taxaDuasParcelas());
            System.out.println("Valor final para duas parcelas " + valorParcela);
        } else if (parcela == 3) {
            double valorParcela;
            valorParcela = valor + (valor * taxaTresParcelas());
            System.out.println("Valor final para tres parcelas " + valorParcela);
        } else {
            System.out.println("Quabtidade de parcela invalida");
        }

    }
}


package calculadora;

import javax.swing.JOptionPane;

public class Entrada {

    double resul;
    String calculo;
    String simbolo;

    public static void main(String[] args) {

        try {

            Entrada entrada = new Entrada();

        } catch (NumberFormatException erro) {

            JOptionPane.showMessageDialog(null, "Numero digitado não valido","ERRO",JOptionPane.ERROR_MESSAGE);
            Entrada.main(args);

        }
    }

    Entrada() {

        String n1, n2;
        double v1, v2;

        n1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero:");
        v1 = Double.parseDouble(n1);

        n2 = JOptionPane.showInputDialog(null, "Digite o segundo numero:");
        v2 = Double.parseDouble(n2);

        int opcao;

        String opcao2 = JOptionPane.showInputDialog(null, "Escolha \n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão");
        opcao = Integer.parseInt(opcao2);

        switch (opcao) {

            case 1:

                resul = Operadores.somaValor(v1, v2);

                calculo = "soma";
                simbolo = " + ";

                break;

            case 2:
                resul = Operadores.subValor(v1, v2);

                calculo = "Subtração";
                simbolo = " - ";

                break;

            case 3:

                resul = Operadores.multValor(v1, v2);

                calculo = "Multiplicação";
                simbolo = " X ";

                break;

            case 4:

                resul = Operadores.divValor(v1, v2);

                calculo = "Divisão";
                simbolo = " / ";

                break;

            default:

                JOptionPane.showMessageDialog(null, "Digite um numero valido.","ERRO",JOptionPane.ERROR_MESSAGE);
                break;

        }

        Resposta.resposta(resul, calculo, simbolo, v1, v2);

    }

}

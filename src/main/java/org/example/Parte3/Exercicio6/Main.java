package org.example.Parte3.Exercicio6;

public class Main {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("PRT1111", "HB20", 2016, 220);
        Veiculo v2 = new Veiculo("TRP4444", "ONYX", 2018, 167);

        v1.registrarViagem(12);
        v2.registrarViagem(23);

        v1.exibirDetalhes();
        v2.exibirDetalhes();
    }
}

package org.example.Parte3.Exercicio6;

class Veiculo{
    String placa;
    String modelo;
    int anoFabricacao;
    double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem){
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.printf("Carro\nPlaca: %s\nModelo: %s\nAno de Fabricação: %d\n Quilometragem: %fKM",placa, modelo, anoFabricacao, quilometragem);
    }

    public void registrarViagem(double valor){
        quilometragem += valor;
    }
}

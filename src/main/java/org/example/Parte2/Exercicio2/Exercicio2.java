package org.example.Parte2.Exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

    public void validaSenha(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scn.nextLine();

        boolean isSenhaOk = false;

        while(!isSenhaOk){
            System.out.println("Digite uma senha: ");
            String senha = scn.nextLine();
            System.out.println("Digite a senha novamente: ");
            String cnfrmSenha = scn.nextLine();
            if(senha.equals(cnfrmSenha)){
                if(senha.length() < 8){
                    throw new Exception("Senha menor que 8 caractéres!");
                }else{
                    for(String letra: senha){
                        ArrayList[] senhaArray = new ArrayList();
                        senhaArray.add(letra); //pegar caractéres especiais e o resto na linha debaixo
                        if(senhaArray.contains(toString().uppercase()) && senhaArray.contains(0..9) && senhaArray.contains(ASCII())){
                            isSenhaOk = true;
                        }
                    }

                }
                throw new Exception("Senhas não coincidem!");
            }
            System.out.println("Insira novamente!");
        }
    }
}
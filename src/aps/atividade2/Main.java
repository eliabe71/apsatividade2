package aps.atividade2;

import enties.actors.*;
import enties.products.*;
import enties.repositories.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean entra1 = true, entra2 = false, entra3 = false;
        
        People repoPessoas = new People();
        Products repoProdutos = new Products();
        Leases repoLocacoes = new Leases();
        Manager manager = new Manager(repoPessoas, repoProdutos, "Kleber", "54321");
        Manager managerloginAtual;
        OperatorSystem oploginAtual;
        repoPessoas.addPeople(manager);
        
	while(entra1){
            String opcao, login, senha;

            System.out.println("***Bem-vindo, escolha um perfil abaixo: ");
            System.out.println("1 - Gerente");
            System.out.println("2 - Operador de Sistema");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");
            
            opcao = sc.next();
            System.out.println();
            System.out.println();
            System.out.println();
            switch(opcao){
                case "1":
                    System.out.println("***Faça seu Login***");
                    System.out.println("Digite seu login: ");
                    login = sc.next();
                    System.out.println("Digite sua senha: ");
                    senha = sc.next();
                    managerloginAtual = repoPessoas.loginManager(login, senha);
                    
                    if(managerloginAtual != null){
                       entra2 = true;
                       entra1 = false;
                    }else{
                        System.out.println();
                        System.out.println("Login ou senha inválida!");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    
               
                    break;
                case "2":
                    System.out.println("***Faça seu Login***");
                    System.out.println("Digite seu login: ");
                    login = sc.next();
                    System.out.println("Digite sua senha: ");
                    senha = sc.next();
                    
                    oploginAtual = repoPessoas.loginOperatorSystem(login, senha);
                    if(oploginAtual != null){
                        entra3 = true;
                        entra1 = false;
                    }
                    else{
                        System.out.println();
                        System.out.println("Login ou senha inválida!");
                        System.out.println();
                        System.out.println();
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Saindo...");
                    entra1 = false;
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        while(entra2){
            
        }
        while(entra3){
            System.out.println("Login efetuado!");
            break;
        }
    }
}

package aps.atividade2;

import enties.actors.*;
import enties.products.*;
import enties.repositories.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int matriculaCliente = 0, idProduto = 0;
        Scanner sc = new Scanner(System.in);
        boolean entra1 = true, entra2 = false, entra3 = false;
        
        People repoPessoas = new People();
        Products repoProdutos = new Products();
        Leases repoLocacoes = new Leases();
        Manager manager = new Manager("Kleber",matriculaCliente++, "Kleber123", "54321", repoPessoas, repoProdutos);
        Manager managerloginAtual = null; // Será usado durante toda a execução do sistema
        OperatorSystem opLoginAtual = null;
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
                    
                    opLoginAtual = repoPessoas.loginOperatorSystem(login, senha);
                    if(opLoginAtual != null){
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
        
        while(entra2){
            
            String opcao;
            String[] idiomas = new String[2];
            
            System.out.println();
            System.out.println();
            System.out.println();
            
            System.out.println("***Olá Gerente " + managerloginAtual.getNome());
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Cadastrar Cliente");
            System.out.println("3 - Cadastrar Operador");
            System.out.println("4 - Listar Produtos");
            System.out.println("5 - Listar Clientes");
            System.out.println("6 - Listar Operadores");
            System.out.println("7 - Porcurar Produto");
            System.out.println("8 - Porcurrar Cliente");
            System.out.println("9 - Procurar Operador");
            System.out.println("10 - Sair");
            
            opcao = sc.next();
            switch(opcao){
                case "1":
                    System.out.println("Qual tipo de produto?");
                    System.out.println("1-Filme");
                    System.out.println("2-Música");
                    System.out.println("Digite uma opção: ");
                    opcao = sc.next();
                    if(opcao.equals("1")){
                        System.out.println("Qual a mídia do filme?");
                        System.out.println("1-Bluray");
                        System.out.println("2-DVD");
                        System.out.println("3-Vhs");
                        System.out.println("Digite uma opção: ");
                        opcao = sc.next();
                        if(opcao.equals("1")){
                            Blurays bluray = new Blurays();
                            bluray.setId(""+idProduto++);
                            bluray.setLocado(false);
                            
                            System.out.println("Digite o título: ");
                            opcao = sc.nextLine();
                            bluray.setTitulo(opcao);
                            
                            System.out.println("Digite o gênero: ");
                            opcao = sc.nextLine();
                            bluray.setGenero(opcao);
                            
                            System.out.println("Digite o ano de lançamento: ");
                            opcao = sc.nextLine();
                            bluray.setAnoLancamaneto(Integer.parseInt(opcao));
                            
                            System.out.println("Digite a duração: ");
                            opcao = sc.nextLine();
                            bluray.setDuracao(Integer.parseInt(opcao));
                            
                            System.out.println("Número de idiomas");
                            opcao = sc.nextLine();
                            
                            for(int i=0; i<Integer.parseInt(opcao); i++){
                                System.out.println("Digite o idioma: ");
                                idiomas[i] = sc.nextLine();
                            }
                            bluray.setIdiomas(idiomas);
                            
                            repoProdutos.add(bluray);
                        }
                    }else if(opcao.equals("2")){
                        
                    }    
                    
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                case "9":
                    break;
                case "10":
                    entra2 = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Digite uma opção válida!");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                    
            }
            
        }
        while(entra3){
            System.out.println("***Olá Operador" + opLoginAtual.getNome());

            break;
        }
    }
}

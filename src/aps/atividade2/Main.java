package aps.atividade2;

import enties.actors.*;
import enties.products.*;
import enties.repositories.*;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int matricula = 0, idProduto = 0;
        Scanner sc = new Scanner(System.in);
        boolean entra1 = true, entra2 = false, entra3 = false;
        
        People repoPessoas = new People();
        Products repoProdutos = new Products();
        Leases repoLocacoes = new Leases();
        Manager manager = new Manager("Aps2020",matricula++, "aps", "123", repoPessoas, repoProdutos);
        Manager managerloginAtual = null; // Será usado durante toda a execução do sistema
        OperatorSystem opLoginAtual = null;
        repoPessoas.addPeople(manager);
        boolean entra = true;
        while(entra){
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
                            managerloginAtual.setRepo(repoPessoas);
                            managerloginAtual.setProduct(repoProdutos);
                            entra2 = true;
                            entra1 = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
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
                            opLoginAtual.setRepoPeople(repoPessoas);
                            opLoginAtual.setRepoProduct(repoProdutos);
                            opLoginAtual.setRepoleases(repoLocacoes);
                            entra3 = true;
                            entra1 = false;
                            System.out.println();
                            System.out.println();
                            System.out.println();
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
                        entra = false;
                        break;
                    default:
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            }

            while(entra2){

                String opcao;
                String[] idiomas = new String[2];

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
                System.out.println("Digite uma opção: ");

                opcao = sc.next();
                System.out.println();
                System.out.println();
                switch(opcao){
                    case "1":
                        System.out.println("Qual tipo de produto?");
                        System.out.println("1-Filme");
                        System.out.println("2-Música");
                        System.out.println("Digite uma opção: ");
                        opcao = sc.next();
                        System.out.println();

                        if(opcao.equals("1")){

                            System.out.println("Qual a mídia do filme?");
                            System.out.println("1-Bluray");
                            System.out.println("2-DVD");
                            System.out.println("3-Vhs");
                            System.out.println("Digite uma opção: ");
                            opcao = sc.next();
                            sc.nextLine();
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
                                opcao = sc.next();
                                bluray.setAnoLancamaneto(Integer.parseInt(opcao));

                                System.out.println("Digite a duração: ");
                                opcao = sc.next();
                                bluray.setDuracao(Integer.parseInt(opcao));

                                System.out.println("Número de idiomas");
                                opcao = sc.next();

                                for(int i=0; i<Integer.parseInt(opcao); i++){
                                    System.out.println("Digite o idioma: ");
                                    idiomas[i] = sc.next();
                                    sc.nextLine();
                                }
                                bluray.setIdiomas(idiomas);

                                if(repoProdutos.add(bluray)){
                                    System.out.println("Bluray adicionado!");
                                }

                            }else if(opcao.equals("2")){
                                Dvds dvd = new Dvds();
                                dvd.setId(""+idProduto++);
                                dvd.setLocado(false);

                                System.out.println("Digite o título: ");
                                opcao = sc.nextLine();
                                dvd.setTitulo(opcao);

                                System.out.println("Digite o gênero: ");
                                opcao = sc.nextLine();
                                dvd.setGenero(opcao);

                                System.out.println("Digite o ano de lançamento: ");
                                opcao = sc.next();
                                dvd.setAnoLancamento(Integer.parseInt(opcao));

                                System.out.println("Digite a duração: ");
                                opcao = sc.next();
                                dvd.setDuracao(Integer.parseInt(opcao));

                                System.out.println("Está arranhado? Digite s ou n");
                                opcao = sc.next();
                                if(opcao.equals("s"))
                                    dvd.setArranhado(true);
                                else
                                    dvd.setArranhado(false);

                                if(repoProdutos.add(dvd)){
                                    System.out.println("DVD adicionado!");
                                }
                            }else if(opcao.equals("3")){
                                Vhss vhss = new Vhss();
                                vhss.setId(""+idProduto++);
                                vhss.setLocado(false);

                                System.out.println("Digite o título: ");
                                opcao = sc.nextLine();
                                vhss.setTitulo(opcao);

                                System.out.println("Digite o gênero: ");
                                opcao = sc.nextLine();
                                vhss.setGenero(opcao);

                                System.out.println("Digite o ano de lançamento: ");
                                opcao = sc.next();
                                vhss.setAnoLancamento(Integer.parseInt(opcao));

                                System.out.println("Digite a duração: ");
                                opcao = sc.next();
                                vhss.setDuracao(Integer.parseInt(opcao));

                                System.out.println("Filme em cores? Digite s ou n");
                                opcao = sc.next();
                                if(opcao.equals("s"))
                                    vhss.setCores(true);
                                else
                                    vhss.setCores(false);

                                if(repoProdutos.add(vhss)){
                                    System.out.println("Vhs adicionado!");
                                }
                            }else{
                                System.out.println("Opção inváida!");
                                System.out.println();
                                System.out.println();
                                System.out.println();
                            }
                        }else if(opcao.equals("2")){
                            System.out.println("Qual a mídia da música?");
                            System.out.println("1-CD");
                            System.out.println("2-LP");
                            System.out.println("Digite uma opção: ");
                            opcao = sc.next();
                            sc.nextLine();
                            if(opcao.equals("1")){
                                Cd cd = new Cd();
                                cd.setId(""+idProduto++);
                                cd.setLocado(false);

                                System.out.println("Digite o título: ");
                                opcao = sc.nextLine();
                                cd.setTitulo(opcao);

                                System.out.println("Digite o gênero: ");
                                opcao = sc.nextLine();
                                cd.setGenero(opcao);

                                System.out.println("Digite o autor: ");
                                opcao = sc.nextLine();
                                cd.setAutor(opcao);

                                System.out.println("Digite o número de faixas: ");
                                opcao = sc.nextLine();
                                cd.setNumFaixas(Integer.parseInt(opcao));

                                System.out.println("Está arranhado? Digite s ou n");
                                opcao = sc.next();
                                if(opcao.equals("s"))
                                    cd.setArranhado(true);
                                else
                                    cd.setArranhado(false);

                                System.out.println("É duplo? Digite s ou n");
                                opcao = sc.next();
                                if(opcao.equals("s"))
                                    cd.setDuplo(true);
                                else
                                    cd.setDuplo(false);

                                if(repoProdutos.add(cd)){
                                    System.out.println("CD adicionado!");
                                }
                            }else if(opcao.equals("2")){
                                Lps lp = new Lps();
                                lp.setId(""+idProduto++);
                                lp.setLocado(false);

                                System.out.println("Digite o título: ");
                                opcao = sc.nextLine();
                                lp.setTitulo(opcao);

                                System.out.println("Digite o gênero: ");
                                opcao = sc.nextLine();
                                lp.setGenero(opcao);

                                System.out.println("Digite o autor: ");
                                opcao = sc.nextLine();
                                lp.setAutor(opcao);

                                System.out.println("Digite o número de faixas: ");
                                opcao = sc.nextLine();
                                lp.setNumFaixas(Integer.parseInt(opcao));

                                System.out.println("É raro? Digite s ou n");
                                opcao = sc.next();
                                if(opcao.equals("s"))
                                    lp.setRaro(true);
                                else
                                    lp.setRaro(false);

                                if(repoProdutos.add(lp)){
                                    System.out.println("LP adicionado!");
                                }
                            }
                        }    
                        break;
                    case "2":
                        sc.nextLine();
                        Client client = new Client();
                        client.setMatricula(matricula++);

                        System.out.println("Digite o nome do cliente: ");
                        opcao = sc.nextLine();
                        client.setNome(opcao);

                        System.out.println("Digite o endereço do cliente: ");
                        opcao = sc.nextLine();
                        client.setEndereco(opcao);

                        System.out.println("Digite a idade do cliente: ");
                        opcao = sc.nextLine();
                        client.setIdade(Integer.parseInt(opcao));

                        System.out.println("Digite o sexo do cliente (m ou f) : ");
                        opcao = sc.next();
                        client.setSexo(opcao.charAt(0));

                        if(repoPessoas.addPeople(client)){
                            System.out.println("Cliente adicionado!");
                        }

                        break;
                    case "3":
                        sc.nextLine();
                        OperatorSystem op = new OperatorSystem();
                        op.setMatricula(matricula++);
                            
                        System.out.println("Digite o nome do operador: ");
                        opcao = sc.nextLine();
                        op.setNome(opcao);

                        System.out.println("Digite o login do operador: ");
                        opcao = sc.next();
                        op.setLogin(opcao);

                        System.out.println("Digite a senha do operador: ");
                        opcao = sc.next();
                        op.setSenha(opcao);
                        sc.nextLine();

                        op.setRepoPeople(repoPessoas);
                        op.setRepoProduct(repoProdutos);
                        op.setRepoleases(repoLocacoes);

                        if(repoPessoas.addPeople(op)){
                            System.out.println("Operador adicionado!");
                        }

                        break;
                    case "4":
                        System.out.println("Produtos: ");
                        System.out.println();
                        managerloginAtual.listarProdutos();
                        break;
                    case "5":
                        System.out.println("Clientes: ");
                        System.out.println();
                        managerloginAtual.listarClientes();
                        break;
                    case "6":
                        System.out.println("Operadores: ");
                        System.out.println();
                        managerloginAtual.listarOperadores();
                        break;
                    case "7":
                        System.out.println("Digite o código do produto: ");
                        opcao = sc.next();
                        if(!managerloginAtual.procurarProduto(opcao)){
                            System.out.println("Não existe produto com esse código!");
                        }
                        break;
                    case "8":
                        System.out.println("Digite a matrícula do cliente: ");
                        opcao = sc.next();
                        if(!managerloginAtual.procurarCliente(Integer.parseInt(opcao))){
                            System.out.println("Não existe cliente com essa matrícula!");
                        }
                        break;
                    case "9":
                        System.out.println("Digite a matrícula do operador: ");
                        opcao = sc.next();
                        if(!managerloginAtual.procurarOperador(Integer.parseInt(opcao))){
                            System.out.println("Não existe operador com essa matrícula!");
                        }
                        break;
                    case "10":
                        entra1 = true;
                        entra2 = false;
                        break;
                    default:
                        System.out.println();
                        System.out.println("Digite uma opção válida!");
                        break;

                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
            while(entra3){
                System.out.println("***Olá Operador "+opLoginAtual.getNome());
                System.out.println("1 - Fazer locação");
                System.out.println("2 - Dar baixa em locação");
                System.out.println("3 - Excluir locação");
                System.out.println("4 - Procurar Produto");
                System.out.println("5 - Procurar Cliente" );
                System.out.println("6 - Sair");
                System.out.println("Digite a opção: ");
                
                String e;

                Scanner ler = new Scanner(System.in);
                e = ler.next();
                ler.nextLine();
                System.out.println();
                System.out.println();
                switch (e){
                    case "1":
                        System.out.println("Digite Código Do Produto");
                        String codigoProduto = ler.next();
                        
                        ler.nextLine();
                        Product p = repoProdutos.get(codigoProduto);
                        if(p != null && !p.isLocado()){
                            
                            System.out.println("Digite a matrícula do Cliente");
                            int matriculaCliente2 = ler.nextInt();
                            Person c = repoPessoas.getPerson(matriculaCliente2);
                            if(c != null && c instanceof Client){
                                Calendar dataSaida = Calendar.getInstance();
                                Calendar dataPrevistaEntrega = Calendar.getInstance();
                                System.out.println("Digite o dia de Entrega");
                                int dia = ler.nextInt();
                                System.out.println("Digite o Mês de Entrega");
                                int mes = ler.nextInt();
                                System.out.println("Digite o Ano de Entrega");
                                int ano = ler.nextInt();
                                dataPrevistaEntrega.set(ano, mes-1 ,dia);
                                Location location = new Location(codigoProduto, matriculaCliente2, dataSaida, dataPrevistaEntrega);
                                if(repoLocacoes.add(location)){
                                    p.setLocado(true);
                                    System.out.println("Locação realizada!");
                                }
                            }else{
                                System.out.println("Cliente não cadastrado!");
                            }
                        }else if(p == null){
                            System.out.println("O produto não existe!");
                        }else{
                            System.out.println("O produto já está locado!");
                        }
                        break;
                    case "2":
                        DecimalFormat df = new DecimalFormat("0.00");
                        System.out.println("Digite o Código do Produto ");
                        String codigo = ler.next();
                        ler.nextLine();
                        double valor = opLoginAtual.fazerbaixa(codigo);
                        if(valor > 0)
                            System.out.println("Total a Ser Pago : R$ " + df.format(valor));
                        else
                            System.out.println("Não é possível dar baixa pois o produto não existe ou não está locado!");
                        break;
                    case "3":
                        System.out.println("Digite o Código do Produto ");
                        String codigo2  = ler.next();
                        ler.nextLine();
                        if(opLoginAtual.removeLocacao(codigo2)){
                            System.out.println("Locação removida!");
                        }else{
                            System.out.println("Locação não existe!");
                        }
                        break;
                    case "4":
                        System.out.println("Digite o Código do Produto ");
                        String codigo3  = ler.next();
                        ler.nextLine();
                        if(!opLoginAtual.procuraProduto(codigo3)) 
                            System.out.println("Produto Inexistente");
                        break;
                    case "5":
                        System.out.println("Digite a Matrícula do Cliente ");
                        int matricula1 = Integer.parseInt(ler.next());
                        ler.nextLine();

                        if(!opLoginAtual.procuraCliente(matricula1))
                            System.out.println("Cliente Inexistente");
                        break;
                    case "6":
                        entra1 = true;
                        entra3 = false;
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }
    }
}

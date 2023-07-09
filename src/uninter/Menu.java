package uninter;

import java.util.Scanner;

public class Menu {
    private Scanner sc;
    private Cofrinho cofrinho;
    
    public Menu() {
        sc = new Scanner(System.in);
        cofrinho = new Cofrinho();
    }
    
    public void exibirMenuPrincipal() {
        System.out.println("COFRINHO:");
        System.out.println("1-Adicionar moeda");
        System.out.println("2-Remover moeda");
        System.out.println("3-Listar moedas");
        System.out.println("4-Calcular valor total convertido para real");
        System.out.println("0-Sair");
        
        String opcaoSelecionada = sc.next();
        
        switch (opcaoSelecionada) {
            case "0":
                System.out.println("Sistema finalizado!");
                break;
                
            case "1":
                exibirSubMenuAdicionarMoedas();
                exibirMenuPrincipal();
                break;
                
            case "2":
                exibirSubMenuRemoverMoedas();
                exibirMenuPrincipal();
                break;
                
            case "3":
                cofrinho.listagemMoedas();
                exibirMenuPrincipal();
                break;
                
            case "4":
                // Calcular o valor total convertido para real
                double valorTotalConvertido = cofrinho.totalConvertido();
                String valorTotalConvertidoTextual = String.format("%.2f", valorTotalConvertido);
                valorTotalConvertidoTextual = valorTotalConvertidoTextual.replace(".", ",");
                System.out.println("O valor total convertido para real é: " + valorTotalConvertidoTextual);
                exibirMenuPrincipal();
                break;
                
            default:
                System.out.println("Opção inválida");
                exibirMenuPrincipal();
                break;
        }
    }
    
    private void exibirSubMenuAdicionarMoedas() {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        
        int opcaoMoeda = sc.nextInt();
        
        System.out.println("Digite o valor:");
        
        String valorTextualMoeda = sc.next();
        
        valorTextualMoeda = valorTextualMoeda.replace(",", ".");
        double valorMoeda = Double.valueOf(valorTextualMoeda);
        
        Moeda moeda = null;
        
        if (opcaoMoeda == 1) {
            // Criar uma instância da moeda Real
            moeda = new Real(valorMoeda);
        } else if (opcaoMoeda == 2) {
            // Criar uma instância da moeda Dolar
            moeda = new Dolar(valorMoeda);
        } else if (opcaoMoeda == 3) {
            // Criar uma instância da moeda Euro
            moeda = new Euro(valorMoeda);
        } else {
            System.out.println("Não existe moeda!");
            exibirMenuPrincipal();
        }
        
        // Adicionar a moeda ao cofrinho
        cofrinho.adicionar(moeda);
        System.out.println("Moeda adicionada!");
    }
    
    private void exibirSubMenuRemoverMoedas() {
        System.out.println("Escolha Moeda:");
        System.out.println("1 - Real");
        System.out.println("2 - Dolar");
        System.out.println("3 - Euro");
        
        int opcaoMoeda = sc.nextInt();
        
        System.out.println("Digite o valor:");
        
        String valorTextualMoeda = sc.next();
        
        valorTextualMoeda = valorTextualMoeda.replace(",", ".");
        double valorMoeda = Double.valueOf(valorTextualMoeda);
        
        Moeda moeda = null;
        
        if (opcaoMoeda == 1) {
            // Criar uma instância da moeda Real
            moeda = new Real(valorMoeda);
        } else if (opcaoMoeda == 2) {
            // Criar uma instância da moeda Dolar
            moeda = new Dolar(valorMoeda);
        } else if (opcaoMoeda == 3) {
            // Criar uma instância da moeda Euro
            moeda = new Euro(valorMoeda);
        } else {
            System.out.println("Não existe moeda!");
            exibirMenuPrincipal();
        }
        
        // Remover a moeda do cofrinho
        boolean removeuMoeda = cofrinho.remover(moeda);
        
        if (removeuMoeda) {
            System.out.println("Moeda removida com sucesso!");
        } else {
            System.out.println("Não foi encontrada nenhuma moeda com esse valor!");
        }
    }
}

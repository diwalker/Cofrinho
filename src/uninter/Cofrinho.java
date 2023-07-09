package uninter;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;
    
    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }
    
    public void adicionar(Moeda moeda) {
        this.listaMoedas.add(moeda);
    }
    
    public boolean remover(Moeda moeda) {
        return this.listaMoedas.remove(moeda);
    }
    
    public void listagemMoedas() {
        // Verifica se o cofrinho está vazio
        if (this.listaMoedas.isEmpty()) {
            System.out.println("Não existe nenhuma moeda no cofrinho!");
            return;
        }
        
        // Itera sobre a lista de moedas e exibe informações sobre cada uma
        for (Moeda moeda : this.listaMoedas) {
            moeda.info();
        }
    }
    
    public double totalConvertido() {
        // Verifica se o cofrinho está vazio
        if (this.listaMoedas.isEmpty()) {
            return 0;
        }
        
        double valorAcumulado = 0;
        
        // Soma o valor convertido de cada moeda na lista
        for (Moeda moeda : this.listaMoedas) {
            valorAcumulado += moeda.converter();
        }
        
        return valorAcumulado;
    }
}

package uninter;

public class Dolar extends Moeda {

    public Dolar(double valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Dólar - " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 5.2;
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se o objeto é a mesma instância
        if (this == objeto) {
            return true;
        }

        // Verifica se o objeto é do tipo Dolar
        if (!(objeto instanceof Dolar)) {
            return false;
        }

        // Faz o cast do objeto para a classe Dolar
        Dolar outraMoeda = (Dolar) objeto;

        // Compara os valores das moedas
        return this.valor == outraMoeda.valor;
    }
}

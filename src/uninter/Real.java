package uninter;

public class Real extends Moeda {

    public Real(double valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

    @Override
    public double converter() {
        return this.valor;
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se o objeto é a mesma instância
        if (this == objeto) {
            return true;
        }

        // Verifica se o objeto é do tipo Real
        if (!(objeto instanceof Real)) {
            return false;
        }

        // Faz o cast do objeto para a classe Real
        Real outraMoeda = (Real) objeto;

        // Compara os valores das moedas
        return this.valor == outraMoeda.valor;
    }
}

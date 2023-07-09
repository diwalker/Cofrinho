package uninter;

public class Euro extends Moeda {

    public Euro(double valorInicial) {
        this.valor = valorInicial;
    }

    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

    @Override
    public double converter() {
        return this.valor * 4.5;
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se o objeto é a mesma instância
        if (this == objeto) {
            return true;
        }

        // Verifica se o objeto é do tipo Euro
        if (!(objeto instanceof Euro)) {
            return false;
        }

        // Faz o cast do objeto para a classe Euro
        Euro outraMoeda = (Euro) objeto;

        // Compara os valores das moedas
        return this.valor == outraMoeda.valor;
    }
}

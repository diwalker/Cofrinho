package uninter;

public abstract class Moeda {
    protected double valor;
    
    // Método abstrato para exibir informações sobre a moeda
    public abstract void info();
    
    // Método abstrato para converter o valor da moeda
    public abstract double converter();
}

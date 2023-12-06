package ImpostoRenda;

import Interface.Tributavel;

public class Salario implements Tributavel {

    private double valor;

    public Salario(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTributos() {
        return valor * 0.1;
    }
}

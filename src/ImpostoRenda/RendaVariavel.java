package ImpostoRenda;

import Interface.Tributavel;

public class RendaVariavel implements Tributavel {
    private double lucros;

    public RendaVariavel(double lucros) {
        this.lucros = lucros;
    }

    @Override
    public double calcularTributos() {
        return lucros * 0.15;
    }
}

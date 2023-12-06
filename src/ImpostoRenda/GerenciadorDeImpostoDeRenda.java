package ImpostoRenda;
import Interface.Tributavel;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private List<Tributavel> tributaveis = new ArrayList<>();


    public void adicionar(Tributavel tributavel){
        tributaveis.add(tributavel);
    }

    public double calcularTotalImpostos() {
        double total = 0;
        for (Tributavel tributavel : tributaveis) {
            total += tributavel.calcularTributos();
        }
        return total;
    }
}

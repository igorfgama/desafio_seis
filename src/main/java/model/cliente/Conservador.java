package model.cliente;

import model.Investimento;
import model.renda_fixa.RendaFixa;
import model.renda_variavel.RendaVariavel;

import java.util.ArrayList;
import java.util.List;

public class Conservador<T extends RendaFixa> extends PerfilCliente {

    List<Investimento> conservadores = new ArrayList<>();

    public void contratarInvestimento(Investimento investimento) {
        if(investimento instanceof RendaVariavel){
            throw new RuntimeException("Investimento incompatível com o perfil do cliente.");
        } else {
            conservadores.add(investimento);
        }
    }

    @Override
    public List<Investimento> getCarteiraInvestimentos() {
        return conservadores;
    }


}

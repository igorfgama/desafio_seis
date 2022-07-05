package model.cliente;

import model.Investimento;
import model.renda_fixa.RendaFixa;
import model.renda_variavel.RendaVariavel;

import java.util.ArrayList;
import java.util.List;

public class Arrojado<T extends RendaVariavel> extends PerfilCliente {
    private List<Arrojado> arrojados = new ArrayList<>();

    @Override
    public void contratarInvestimento(Investimento investimento) {
        if(investimento instanceof RendaFixa){
            throw new RuntimeException("Investimento incompatível com o perfil do cliente.");
        } else {
            arrojados.add((Arrojado) investimento);
        }
    }

    @Override
    public List getCarteiraInvestimentos() {
        return arrojados;
    }
}

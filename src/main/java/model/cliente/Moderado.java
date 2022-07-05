package model.cliente;

import model.Investimento;
import model.renda_fixa.RendaFixa;
import model.renda_variavel.RendaVariavel;

import java.util.ArrayList;
import java.util.List;

public class Moderado extends PerfilCliente {
    List<Investimento> moderados = new ArrayList<>();

    @Override
    public void contratarInvestimento(Investimento investimento) {

    }

    @Override
    public List<Investimento> getCarteiraInvestimentos() {
        return moderados;
    }
}

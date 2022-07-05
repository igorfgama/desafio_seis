package model.cliente;

import model.Investimento;

import java.util.List;

public abstract class PerfilCliente<T extends Investimento> {

    public abstract void contratarInvestimento(T investimento);

    public abstract List<T> getCarteiraInvestimentos();
}


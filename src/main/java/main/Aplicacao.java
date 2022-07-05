package main;

import model.Investimento;
import model.cliente.Arrojado;
import model.cliente.Conservador;
import model.renda_fixa.CDB;
import model.renda_fixa.Tesouro;
import model.renda_variavel.Acao;
import model.renda_variavel.FundoImobiliario;

public class Aplicacao {
    public static void main(String[] args) {
        var conservador = new Conservador();
        //método contratarInvestimento adiciona na lista de investimentos do cliente
        conservador.contratarInvestimento(new CDB());
        conservador.contratarInvestimento(new Tesouro());

        conservador.contratarInvestimento(new Acao());//ERRO de compilação

        for (Investimento i : conservador.getCarteiraInvestimentos()) {
            System.out.println(i);
        }

        var arrojado = new Arrojado();
        arrojado.contratarInvestimento(new Acao());
        arrojado.contratarInvestimento(new FundoImobiliario());

        arrojado.contratarInvestimento(new Tesouro());//ERRO de compilação

        for (Investimento i : arrojado.getCarteiraInvestimentos()) {
            System.out.println(i);
        }
    }
}

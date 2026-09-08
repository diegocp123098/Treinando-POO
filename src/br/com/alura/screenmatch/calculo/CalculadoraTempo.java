package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoMinutos();
    }

}

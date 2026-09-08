package br.com.alura.screenmatch.calculo;

public class FiltroRecomentadacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");
        }else if (classificavel.getClassificacao() >=2){
            System.out.println("Ate que ta boa");
        }else {
            System.out.println("No momento parece ruim");
        }


    }
}

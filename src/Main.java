import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomentadacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Vingadores");
        meuFilme.setAnoLancamento(2007);
        meuFilme.setDuracaoMinutos(150);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.mediaAvaliacao());

        /*
        meuFilme.somaAvaliacao = 10;
        meuFilme.totalAvaliacao = 1;
        System.out.println(meuFilme.mediaAvaliacao());
        */
        Serie lost = new Serie();

        lost.setNome("Lost");
        lost.setAnoLancamento(2020);
        lost.exibeFichaTecnica();
        lost.setTemporadas(20);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(60);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoMinutos());

        Filme filme2 = new Filme();

        filme2.setNome("Miranha");
        filme2.setAnoLancamento(2000);
        filme2.setDuracaoMinutos(200);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomentadacao filtro = new FiltroRecomentadacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


    }
}

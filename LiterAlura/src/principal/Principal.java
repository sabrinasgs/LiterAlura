package principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
//        meuFilme.somaDasAvaliacoes = 10;
//        meuFilme.totalAvaliacoes = 1;
//        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporada(10);
        lost.setEpsPorTemporada(10);
        lost.setMinutorPorEps(50);
        System.out.println("Duração para manatorar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        //outroFilme.setNome("Avatar");
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio epsisodio = new Episodio();
        epsisodio.setNumero(1);
        epsisodio.setSerie(lost);
        epsisodio.setTotalVizualizaoes(300);
        filtro.filtra(epsisodio);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        //filmeDoPaulo.setNome("Dogville");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoPaulo);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());


    }
}